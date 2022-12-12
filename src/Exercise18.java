import java.util.Arrays;
import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(run()));
    }

    public static int[] run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower number ");
        final int lower = scanner.nextInt();
        System.out.println("Enter the upper number ");
        final int upper = scanner.nextInt();

        if (lower > upper) {
            throw new IllegalArgumentException("lower cannot be greater than upper");
        }

        final int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            // (int) casting to int
            numbers[i] = (int) (Math.random() * (upper - lower)) + lower;
        }

        return numbers;
    }

}
