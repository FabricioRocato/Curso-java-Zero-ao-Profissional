package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
     private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void Acelerar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta() ;
        }
    }

    public void Frear(){
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " Mph";
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

}
