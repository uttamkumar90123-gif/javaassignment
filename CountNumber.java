import java.util.*;

public class CountNumber{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 55, 60, 45, 80, 30);

        long count = list.stream()
                .filter(x -> x > 50)
                .count();

        System.out.println("Numbers greater than 50: " + count);
    }
}

