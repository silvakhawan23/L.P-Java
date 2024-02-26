package cadastro;

public class teste {
    public static void main(String[] args) {
    
        int opc ;
        int i =0 ;
        pessoa1[ ]v =  new pessoa1[2];

        do{
           opc= Teclado.lerInteiro(" 1-cadastro\n 2-alterar\n 3-excluir\n 4-consulta \n 5-sair ");
           System.out.println(opc);
            if(opc == 1){
                if (i>=2){
                for(i=0;i>2;i++){
                    if(v[i]== null){
                        v[i].nome = Teclado.lerString("Digite seu nome ");
                        v[i].cpf = Teclado.lerInteiro("Digite seu cpf ");
                    }
                    else System.out.println("ja ta cheio irmao");

                }
            }
                v[i]=new pessoa1() ;
                v[i].nome = Teclado.lerString("Digite seu nome\n ");
                v[i].cpf = Teclado.lerInteiro("Digite seu cpf\n");
                i++;
            
               
            }
            if(opc==2){
                int j= Teclado.lerInteiro("Digite a posição ");
                v[j]= new pessoa1();
                v[j].nome = Teclado.lerString("Digite seu nome ");
                v[j].cpf = Teclado.lerInteiro("Digite seu nome ");



            }
            if(opc==3){
                int j= Teclado.lerInteiro("Digite a posição ");
                v[j]= new pessoa1();

            }
            if (opc==4){
                int j= Teclado.lerInteiro("Digite a posição ");
                System.out.println("nome"+" "+v[j].nome);
                System.out.println("nome"+" "+v[j].cpf);
            }

           
           

        }while (opc!=5);
        
        } 
    
}
