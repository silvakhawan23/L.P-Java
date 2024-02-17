package Java_LP1.Exercicios_Cap4;

public class Data {
    int dia;
    int mes;
    int ano;

    public void definirData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    } 
    public String formatandoData(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
}
