package Exercicios_Capitulo_3;
public class Exerc_6 {
    public static void main (String args []){
        int fibonacci_1 = 0;
        int fibonacci_2 = 1;
        for (int i = 0; i <101; i++)
        {
            System.out.println(fibonacci_1 + ", " + fibonacci_2 );
            fibonacci_1 = fibonacci_1 + fibonacci_2;
            fibonacci_2 = fibonacci_1 + fibonacci_2;
            if (fibonacci_1 > 100|| fibonacci_2 > 100) {
                break;
            }

        }
    }
}
