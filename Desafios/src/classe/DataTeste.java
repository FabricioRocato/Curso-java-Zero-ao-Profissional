package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.Dia = "05";
        d1.Mes = "06";
        d1.Ano = "1998";

        System.out.printf("Your date of birth is :" + d1.obeterDataFormatada());
    }
}
