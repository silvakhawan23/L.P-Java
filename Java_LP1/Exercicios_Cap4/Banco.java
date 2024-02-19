package Java_LP1.Exercicios_Cap4;

public class Banco {
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;
   
    public void saque (double v)
    {
        saldo = saldo - v;
        System.err.println("Valor sacado:R$ " + v  ); 
    }
    public void depositar ( double v)
    {
        saldo = saldo +v;
        System.err.println("Valor depositado:R$ " + v + "\nValor atual na conta:R$" + saldo ); 
    }
    public double calculaRendimento ( ){
        double rend;
        rend = saldo *0.1;
        return rend;
    }
     public String recuperaDadosParaImpressao(){
        String dados;
        dados = "Titular: "+ nomeTitular +"\nNumero: "+numero+"\nAgencia: "+agencia+"\nSaldo: "+saldo+"$\nData de Abertura da Conta: ";
       dados += dataDeAbertura.formatandoData(); 
       return dados;
     }
 }
