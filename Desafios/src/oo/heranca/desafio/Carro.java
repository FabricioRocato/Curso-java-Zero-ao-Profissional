package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

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
