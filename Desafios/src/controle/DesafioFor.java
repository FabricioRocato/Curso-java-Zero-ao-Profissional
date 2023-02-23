package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String teste = "#####";
        String valor= "#";
        for(String i = "#"; i.length() <= teste.length() ; i += "#"){
            System.out.println(valor);
            valor += "#";
        }

        // Versão do desafio
        // Não pode usar valor numerico pra controlar o laço!

    }
}
