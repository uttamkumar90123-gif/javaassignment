import java.util.*;
import java.util.stream.*;

public class UpperCaseStrings {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "stream", "code");

        List<String> result = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
