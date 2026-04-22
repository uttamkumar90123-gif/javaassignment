import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestStringUsingReduce {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Programming", "Code", "Developer");

        Optional<String> longest = words.stream()
                .reduce((a, b) -> a.length() > b.length() ? a : b);

        if (longest.isPresent()) {
            System.out.println("Longest string: " + longest.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
