import java.util.*;
import java.util.stream.*;

public class LetterCheck {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple", "banana", "grape", "kiwi", "orange", "mango"
        );

        List<String> result = list.stream()
                .filter(str -> str.contains("e"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
