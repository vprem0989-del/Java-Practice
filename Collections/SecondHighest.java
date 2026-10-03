package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class SecondHighest {

    public static void main(String[] args) {

        Integer[] numbers = {10, 30, 20, 50, 40, 50};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(numbers));

        Integer[] uniqueNumbers = set.toArray(new Integer[0]);

        Arrays.sort(uniqueNumbers);

        System.out.println("Second highest: "
                + uniqueNumbers[uniqueNumbers.length - 2]);
    }
}