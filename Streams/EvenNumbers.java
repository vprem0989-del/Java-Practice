package Streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(30, 10, 25, 8, 20, 15, 4);

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .sorted()
               .forEach(System.out::println);
    }
}