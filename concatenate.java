import java.util.Arrays;
import java.util.List;

public class concatenate {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", " ", "World", "!");

        String result = words.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated String: " + result);
    }
}
