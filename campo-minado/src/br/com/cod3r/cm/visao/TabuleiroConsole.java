package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);
    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
        }
        private void executarJogo(){
        try {
            boolean continuar = true;

            while (continuar) {
                cicloDoJogo();
                System.out.println("Outra partida? (S/n) ");
                String resposta = entrada.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Tchau!!!");
        } finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {

            while(tabuleiro.objeticoAlcancado()) {
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (x , y): ");

                Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e));
            }

            System.out.println("Você ganhou!!!!");
        } catch (ExplosaoException e) {
            System.out.println("Você perdeu!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.println(texto);
        String digitado = entrada.nextLine();

        if ("sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }
        return  digitado;
    }
}
