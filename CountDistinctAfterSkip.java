import java.util.*;

public class CountDistinctAfterSkip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 20, 30, 40, 40, 50, 60);

        long count = list.stream()
                .skip(3)
                .distinct()
                .count();
        System.out.println("Distinct count after skipping 3: " + count);
    }
}