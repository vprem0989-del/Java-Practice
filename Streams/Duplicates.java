package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(15, 22, 6, 8, 22, 30, 33, 6, 2, 20);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("After removing duplicates " + uniqueNumbers);
    }
}