package Collections;

import java.util.HashSet;

public class HashSetDuplicate {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        HashSet<Integer> set = new HashSet<>();

        for (int number : numbers) {

            if (!set.add(number)) {
                System.out.println("Duplicate: " + number);
            }
        }
    }
}