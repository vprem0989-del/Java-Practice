package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(15, 22, 6, 8, 30, 33, 2, 20);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted: " + sortedNumbers);
    }
}
