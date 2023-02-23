package oo.heranca.desafio;

public class TestDrive {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Corola corola = new Corola();
        
        ferrari.Acelerar();
        ferrari.Acelerar();
        ferrari.Acelerar();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        ferrari.Frear();
        System.out.println("Ferrari está á: " + ferrari.velocidadeAtual + " Mph");

        corola.Acelerar();
        corola.Acelerar();
        corola.Acelerar();
        corola.Frear();
        System.out.println("Corola está á: " + corola.velocidadeAtual + " Mph");


    }
}
