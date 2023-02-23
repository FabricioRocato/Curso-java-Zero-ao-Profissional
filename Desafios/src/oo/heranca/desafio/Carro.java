package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual = 60;

    int Acelerar(){
        velocidadeAtual += 5;
        return velocidadeAtual;
    }

    int Frear(){
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 5;
            return velocidadeAtual;
        }
        return velocidadeAtual;
    }
}
