package Streams;

import java.util.List;

public class Min {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(15, 22, 6, 8, 30, 33, 2, 20);

        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Minimum " + min);
    }
}