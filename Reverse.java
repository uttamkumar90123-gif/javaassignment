import java.util.Arrays;

public class Reverse{
    public static void main(String[] args) {
        String input = "Hello";

        String reversed = Arrays.stream(input.split(""))
                .reduce("", (a, b) -> b + a);

        System.out.println("Reversed String: " + reversed);
    }
}
