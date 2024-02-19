package Java_LP1.Exercicios_Cap4;

public class Bank
 {
  
    public static void main (String args [])
    {
        Banco rico = new Banco();
        rico.numero = 1001;
        rico.agencia = "centro";
        rico.dataDeAbertura = new Data();
        rico.dataDeAbertura.definirData(23, 03, 2004);
        rico.nomeTitular = "Khawan";
        rico.saldo = 10000;
        rico.saque(100);
        rico.depositar(30);
        System.out.println("Rendimento: "+ rico.calculaRendimento());
        System.out.println(rico.recuperaDadosParaImpressao());
        System.out.println("\n");

        //comparação de duas variavel do tipo banco 
        Banco	bank1	=	new	Banco();								
        bank1.nomeTitular	=	"geovana";
        bank1.saldo	=	6700;
        Banco	bank2	=	new	Banco();								
        bank2.nomeTitular	=	"Vinicius";
        bank2.saldo	=	500;
        if	(bank1	==	bank2)	{
                        System.out.println("iguais");
        }	else	{
                        System.out.println("diferentes");
                        System.out.println("\n");								
        }

        //atribui o valor de bank3 no bank2 e comparei
        Banco bank3 = new Banco();
        bank3.nomeTitular = "Rafael";
        bank3.saldo = 100;
        bank2 = bank3;
        if	(bank3	==	bank2)	{
            System.out.println("iguais");
        }	else	{
            System.out.println("diferentes");								
            }


    }
}
