package classe;

public class Data {
    String Dia;
    String Mes;
    String Ano;

    String obeterDataFormatada() {
        return String.format("%s/%s/%s", Dia, Mes, Ano);
    }
}
