package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;

    void Acelerar(){
        velocidadeAtual += 5;
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
