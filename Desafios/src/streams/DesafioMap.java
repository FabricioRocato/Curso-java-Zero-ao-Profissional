package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
    public static void main(String[] args) {

        /*
         * 1. Número para string binária... 6 => "110"
         * 2. Reverter a string... "110" => "011"
         *  3. Converter de volta para inteiro => "011" => 3
         */

        List<Integer
                > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer,String>binary = n -> Integer.toBinaryString(n);
        Function<String, String> reverse = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> binaryToInt = n -> Integer.parseInt(n,2);

        System.out.println("Integers to binary");
        nums.stream()
                .map(binary)
                .forEach(System.out::println);

        System.out.println("\nReverse binary order");
        nums.stream()
                .map(binary)
                .map(reverse)
                .forEach(System.out::println);

        System.out.println("\nBack to numbers");
        nums.stream()
                .map(binary)
                .map(reverse)
                .map(binaryToInt)
                .forEach(System.out::println);

    }
}
