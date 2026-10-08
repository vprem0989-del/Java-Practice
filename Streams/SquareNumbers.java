package Streams;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {

    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(2,4,6,3,9,12);
        List<Integer> squarIntegers = numbers.stream()
        .map(i -> i*i)
        .collect(Collectors.toList());
        
        System.out.println("Square Number" + squarIntegers);
    }
    
}
