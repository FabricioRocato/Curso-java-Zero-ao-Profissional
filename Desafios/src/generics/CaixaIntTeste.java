package generics;

public class CaixaIntTeste {
    public static void main(String[] args) {

        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(99764);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
