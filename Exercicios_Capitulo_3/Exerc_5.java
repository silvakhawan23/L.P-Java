package Exercicios_Capitulo_3;
public class Exerc_5 {
    public static void main(String[] args) {
        long	fatorial	=	1;
        for	(long	n	=	1;	n	<=	40;	n++)	
        {
            fatorial = fatorial * n;
            System.out.println(fatorial);
        }
    }
    //apos mudar a variavel para long o numero de resultados corretos aumetou, pois o long tem mais espaço de memoria em comparaçao ao int
}
