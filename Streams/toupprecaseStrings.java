package Streams;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<String> names = List.of("apple", "banana", "eat", "drink" , "water");
        List<String> toupprecaseStrings = names.stream()
        .map(e -> e.toUpperCase())
        .collect(Collectors.toList());
        System.out.println("Strings in uppercase "+toupprecaseStrings);

    }
}
