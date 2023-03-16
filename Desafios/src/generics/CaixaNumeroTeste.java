package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {

        CaixaNumero<Integer> caixaA = new CaixaNumero<Integer>();
        caixaA.guardar(1);
        System.out.println(caixaA.abrir());

        CaixaNumero<Double> caixaB = new CaixaNumero<Double>();
        caixaB.guardar(1.0);
        System.out.println(caixaA.abrir());
    }
}
