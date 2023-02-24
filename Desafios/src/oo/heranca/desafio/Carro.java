package oo.heranca.desafio;

public class Carro {

    public Carro(){
        this.velocidadeAtual = velocidadeAtual;
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }
    int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    public void Acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    public void Frear(){
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
