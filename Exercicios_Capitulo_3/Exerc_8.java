package Exercicios_Capitulo_3;
public class Exerc_8 {
    public static void main(String[] args) {
        int n = 10; 
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(i * j + "\t");
            }
            System.out.println(); 
        }
    }
}
