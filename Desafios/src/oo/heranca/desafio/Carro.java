package oo.heranca.desafio;

public class Carro {

    Carro(int velocidadeAtual, int VELOCIDADE_MAXIMA){
        this.velocidadeAtual = velocidadeAtual;
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    void Acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void Frear(){
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " Mph";
    }
}
