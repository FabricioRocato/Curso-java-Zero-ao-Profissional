package oo.heranca.desafio;

public class Corola extends Carro{
    public Corola() {
        super();
    }

    @Override
    public void Acelerar(){
        velocidadeAtual += 5;
    }

    public void Frear(){
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

}
