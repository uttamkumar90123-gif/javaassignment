import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxVowelsUsingReduce {

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Programming", "Developer", "Education");


        Optional<String> result = words.stream()
                .reduce((a, b) -> countVowels(a) > countVowels(b) ? a : b);

        if (result.isPresent()) {
            System.out.println("String with highest vowels: " + result.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
