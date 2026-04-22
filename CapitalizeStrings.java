import java.util.*;
import java.util.stream.*;

public class CapitalizeStrings {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("hello", "java", "stream");

        List<String> result = words.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
