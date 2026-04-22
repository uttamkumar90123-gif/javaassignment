import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
