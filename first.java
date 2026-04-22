import java.util.*;
import java.util.stream.*;

public class first {
    public static void main(String[] args) {

        String input = "Aman Kiran John Riya Mohan";

        List<String> result = Arrays.stream(input.split("\\s+"))
                .filter(name -> name.endsWith("n"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
