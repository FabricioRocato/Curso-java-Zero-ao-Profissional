package oo.heranca.desafio;

public class TestDrive {
    public static void main(String[] args) {

        Carro ferrari = new Ferrari();
        Corola corola = new Corola();
        
        ferrari.Acelerar();
        ferrari.Acelerar();
        ferrari.Acelerar();
        System.out.println(ferrari);

        ferrari.Frear();
        ferrari.Frear();
        System.out.println(ferrari);

        corola.Acelerar();
        corola.Acelerar();
        corola.Acelerar();
        System.out.println(corola);

        corola.Frear();
        corola.Frear();

        System.out.println(corola);

    }
}
