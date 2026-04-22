interface MathOperation {
    int operation(int a, int b);
}
public class MaxOfTwoNumbers {
    public static void main(String[] args) {

        MathOperation max = (a, b) -> (a > b) ? a : b;

        int result = max.operation(10, 25);

        System.out.println("Maximum: " + result);
    }
}
