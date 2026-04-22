import java.util.*;
public class SkipElement{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");

        list.stream()
                .limit(list.size() - 2)
                .forEach(System.out::println);
    }
}
