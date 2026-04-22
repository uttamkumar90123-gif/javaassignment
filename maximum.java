import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maximum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 30);

        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);

        if (max.isPresent()) {
            System.out.println("Maximum element: " + max.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
