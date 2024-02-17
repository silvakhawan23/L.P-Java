package Java_LP1.Exercicios_Cap4;

public class Banco {
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;
    //Banco.saldo	=	1234; nao faz sentido (exercicio 8)
    //Banco.calculaRendimento(); nao faz sentido (exercicio 8)

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
        String dados;
        dados = "Titular: "+ nomeTitular +"\nNumero: "+numero+"\nAgencia: "+agencia+"\nSaldo: "+saldo+"$\nData de Abertura da Conta: ";
       // dados += dataDeAbertura.dia+"/"+dataDeAbertura.mes+"/"+dataDeAbertura.ano;
       dados += dataDeAbertura.formatandoData(); 
       return dados;
     }
 }
