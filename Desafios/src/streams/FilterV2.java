package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterV2 {

    public static void main(String[] args) {

        // PRECO NOME DESCONTO FRETE
        // FILTERS --ACIMA DE 30% DESCONTO E FRETE GRATIS
        // MAP MOSTRANDO SUPER PROMOÇÂO/ NOME / PREÇO

        Produto p1 = new Produto("Laptop", 8000.00, 0, "GRATIS");
        Produto p2 = new Produto("Notebook", 30.00, 30, "GRATIS");
        Produto p3 = new Produto("Printer", 600.00, 35, "GRATIS");
        Produto p4 = new Produto("Mouse", 250.00, 15, "NÃO GRATIS");
        Produto p5 = new Produto("Keyboard", 1500.00, 50, "GRATIS");

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> descontoAcima = a -> a.desconto >= 30;
        Predicate<Produto> freteGratis = a -> a.frete.equals("GRATIS");
        Function<Produto, String> duperPromocao =
                a -> "SUPER PROMOÇÃO " + a.nome + " !PREÇO ESTÀ POR APENAS! " + "R$" + a.preco;

        produtos.stream()
                .filter(descontoAcima)
                .filter(freteGratis)
                .map(duperPromocao)
                .forEach(System.out::println);
    }
}
