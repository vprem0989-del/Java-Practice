package Collections;

import java.util.HashMap;

public class FirstNonRepeated {

    public static void main(String[] args) {

        String text = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : text.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character: " + ch);
                break;
            }
        }
    }
}