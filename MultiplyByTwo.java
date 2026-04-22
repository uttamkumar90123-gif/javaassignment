import java.util.*;
import java.util.stream.*;
public class MultiplyByTwo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        List<Integer> result = nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
