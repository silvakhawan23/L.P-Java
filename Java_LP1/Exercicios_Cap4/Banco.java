package Java_LP1.Exercicios_Cap4;

public class Banco {
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    public void saque (double v)
    {
        saldo = saldo - v;
        System.err.println("Valor sacado: " + v + "$ \nValor atual na conta: " + saldo+"$" ); 
    }
    public void depositar ( double v)
    {
        saldo = saldo +v;
        System.err.println("Valor depositado: " + v + "$ \nValor atual na conta:" + saldo+"$" ); 
    }
    public double calculaRendimento ( ){
        double rend;
        rend = saldo *0.1;
        return rend;
    }
     public String recuperaDadosParaImpressao(){
        String data;
        data = "Titular: "+ nomeTitular +"\nNumero: "+numero+"\nAgencia: "+agencia+"\nSaldo: "+saldo+"$\nData de Abertura da Conta: "+dataDeAbertura;
        return data;
     }
 }
