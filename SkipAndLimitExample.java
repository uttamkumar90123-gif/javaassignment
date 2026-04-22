import java.util.*;

public class SkipAndLimitExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        list.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
    }
}
