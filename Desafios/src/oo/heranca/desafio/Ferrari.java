package oo.heranca.desafio;

public class Ferrari extends Carro{

    int Acelerar(){
        velocidadeAtual += 5;
        velocidadeAtual += 5;
        velocidadeAtual += 5;
        return velocidadeAtual;
    }

    int Frear(){
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 5;
            velocidadeAtual -= 5;
            velocidadeAtual -= 5;
            return velocidadeAtual;
        }
        return velocidadeAtual;
    }
}