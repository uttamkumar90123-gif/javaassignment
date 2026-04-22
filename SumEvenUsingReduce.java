import java.util.Arrays;
import java.util.List;

public class SumEvenUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 40);

        int sumEven = numbers.stream()
                .reduce(0,
                        (sum, num) -> (num % 2 == 0) ? sum + num : sum);

        System.out.println("Sum of even numbers: " + sumEven);
    }
}
