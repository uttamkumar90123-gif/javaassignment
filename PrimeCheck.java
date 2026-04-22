import java.util.*;
import java.util.stream.*;

public class PrimeCheck {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        List<Integer> result = list.stream()
                .filter(PrimeCheck::isPrime)
                .collect(Collectors.toList());

        System.out.println(result);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
