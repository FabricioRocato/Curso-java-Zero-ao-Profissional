package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){
    }

    Produto(String nomeInicial){
        nome = nomeInicial;
    }

    Produto(String nomeInicial, double preco){
        nome = nomeInicial;
        preco = preco;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
