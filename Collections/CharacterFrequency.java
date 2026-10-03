package Collections;

import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {

        String text = "Swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}