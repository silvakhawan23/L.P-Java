package Java_LP1.Exercicios_Cap4;

public class TestaBanco {
  
    public static void main (String args [])
    {
        Banco inter = new Banco();
        inter.agencia = "coxipo";
        inter.dataDeAbertura = "15/02/2024";
        inter.nomeTitular = "rafael";
        inter.saldo = 3500;
        inter.saque(200);
        inter.depositar(2000);
        System.out.println("Rendimento: "+inter.calculaRendimento());
    }
}
