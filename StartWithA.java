import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithA{
    public static void main(String[] args){

        List<String> names = List.of("Aman", "Akash", "Ram", "Rohan", "Alok");
        List<String> Newnames = names.stream()
        .filter(e ->e.startsWith("A"))
        .collect(Collectors.toList());

        System.out.println("Names Start with Latter A " + Newnames);
    }
}

   

  