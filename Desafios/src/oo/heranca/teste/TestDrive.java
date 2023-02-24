package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Corola;
import oo.heranca.desafio.Ferrari;

public class TestDrive extends Carro{

    protected TestDrive(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(400);

        ferrari.Acelerar();
        ferrari.ligarTurbo();
        ferrari.Acelerar();
        ferrari.Acelerar();
        System.out.println("Ferrari " + ferrari);

        ferrari.Frear();
        ferrari.Frear();
        System.out.println("Ferrari " + ferrari);

        Carro corola = new Corola();

        corola.Acelerar();
        corola.Acelerar();
        corola.Acelerar();
        System.out.println("Corola " + corola);

        corola.Frear();
        corola.Frear();

        System.out.println("Corola " + corola);

    }
}
