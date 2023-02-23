package controle;
import java.util.Scanner;
public class DesafioWhile {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double notes = 0.0;
            double total =0;
            int valid = 0;

            System.out.println("We are about to calcular grades...");
            System.out.println("To stop type in -1");
            System.out.println("Please type in the students notes: ");
            while(notes != -1 ) {
                notes = scanner.nextDouble();
                if (notes >= 0 && notes <= 10) {
                    total += notes;
                    valid++;
                } else if(notes == -1){
                    System.out.println("you have exited");
                } else {
                    System.out.println("The number is not valid please enter it again");
                }
            }
            System.out.println("The average was :" + total/valid);
            System.out.println("You entered " + valid + " students grades");
        }
    }
