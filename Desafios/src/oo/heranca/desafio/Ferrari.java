package oo.heranca.desafio;

public class Ferrari extends Carro{

    Ferrari(){
        super(10,315);
    }
    @Override
    void Acelerar(){
        velocidadeAtual += 15;
    }

    void Frear(){
        if (velocidadeAtual >= 15) {
            velocidadeAtual -= 15;
        } else {
            velocidadeAtual = 0;
        }
    }
}