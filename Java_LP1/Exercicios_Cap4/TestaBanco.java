package Java_LP1.Exercicios_Cap4;

public class TestaBanco {
  
    public static void main (String args [])
    {
        Banco inter = new Banco();
        inter.numero = 1001;
        inter.agencia = "coxipo";
        inter.dataDeAbertura = new Data();
        inter.dataDeAbertura.definirData(17, 02, 2024);
        inter.nomeTitular = "rafael";
        inter.saldo = 3500;
        inter.saque(200);
        inter.depositar(2000);
        System.out.println("Rendimento: "+inter.calculaRendimento());
        System.out.println(inter.recuperaDadosParaImpressao());
        Banco	c1	=	new	Banco();								
        c1.nomeTitular	=	"Danilo";
        c1.saldo	=	100;
        Banco	c2	=	new	Banco();								
        c2.nomeTitular	=	"Danilo";
        c2.saldo	=	100;
        if	(c1	==	c2)	{
                        System.out.println("iguais");
        }	else	{
                        System.out.println("diferentes");								
        }
        Banco c3 = new Banco();
        c3.nomeTitular = "Rafael";
        c3.saldo = 100;
        c2 = c3;
        if	(c3	==	c2)	{
            System.out.println("iguais");
        }	else	{
            System.out.println("diferentes");								
            }


    }
}
