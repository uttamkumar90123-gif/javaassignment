import java.util.*;

public class Check {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,30,40,40,50,51,52,53);

        list.stream()
                .limit(list.size() - 2)
                .forEach(System.out::println);
    }
}
