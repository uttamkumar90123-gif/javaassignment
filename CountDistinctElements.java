import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 20, 30, 40, 40, 50);

        long count = list.stream()
                .distinct()
                .count();

        System.out.println("Distinct elements count: " + count);
    }
}
