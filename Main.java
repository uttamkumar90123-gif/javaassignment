import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        String input = "10 15 18 20 21 30 33";

        List<Integer> result = Arrays.stream(input.trim().split("\\s+"))
                .map(Integer::parseInt)
                .filter(x -> x % 3 == 0 && x % 5 != 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
