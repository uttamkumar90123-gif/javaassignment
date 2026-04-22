import java.util.*;
import java.util.stream.*;

public class SquareFilter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 5, 30);

        List<Integer> result = numbers.stream()
                .filter(x -> x * x > 500)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
