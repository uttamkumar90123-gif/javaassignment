import java.util.*;
import java.util.stream.*;

public class StringLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "stream");

        List<Integer> result = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
