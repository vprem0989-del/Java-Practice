package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);

        List<Integer> duplicates = numbers.stream()
                .filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Duplicates: " + duplicates);
    }
}