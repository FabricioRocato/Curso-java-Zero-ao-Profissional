package oo.heranca.desafio;

public class Ferrari extends Carro{

    public Ferrari(){
        super();
    }

    @Override
    public void Acelerar(){
        velocidadeAtual += 15;
    }

    public void Frear(){
        if (velocidadeAtual >= 15) {
            velocidadeAtual -= 15;
        } else {
            velocidadeAtual = 0;
        }
    }
}