import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinimum {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 30);

        Optional<Integer> min = numbers.stream()
                .reduce((a, b) -> a < b ? a : b);

        if (min.isPresent()) {
            System.out.println("Minimum element: " + min.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
