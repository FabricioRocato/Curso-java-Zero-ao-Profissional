package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the name of the week: ");
        var day = scanner.next().toLowerCase();

        var res = (("sunday").equals(day)) ? "1" :
                (("monday").equals(day)) ? "2" :
                        (("tuesday").equals(day)) ? "3" :
                                (("wednesday").equals(day)) ? "4" :
                                        (("thursday").equals(day)) ? "5" :
                                                (("friday").equals(day)) ? "6" :
                                                        (("saturday").equals(day)) ? "7" :
                                                                "Invalid day of the week";

        System.out.println(res);
    }
}

