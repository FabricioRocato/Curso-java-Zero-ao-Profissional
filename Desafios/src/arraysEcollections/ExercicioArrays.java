package arraysEcollections;

import java.util.Scanner;

public class ExercicioArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quant = 0;

        System.out.println("How many notes do you wish to input?");
        quant = scanner.nextInt();
        double notas[] = new double[quant];

        for (int i = 0; quant > i; i++) {
            System.out.println("Input note number" + (i +1));
            notas[i] = scanner.nextDouble();
        }
        double total = 0;
        for(double nota: notas){
        total += nota;
        }

        double media = total / notas.length;
        System.out.println("Your average is " + media + "!");
    }
}
