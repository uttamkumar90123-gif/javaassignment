import java.util.*;

public class EvenNumberPrint {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14);

        list.stream()
                .filter(n -> n % 2 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
