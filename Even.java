import java.util.Arrays;
import java.util.List;

public class Even {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 40);

        int countEven = numbers.stream()
                .reduce(0,
                        (count, num) -> (num % 2 == 0) ? count + 1 : count,
                        Integer::sum);

        System.out.println("Count of even numbers: " + countEven);
    }
}
