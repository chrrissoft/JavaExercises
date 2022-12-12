import java.util.ArrayList;
import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static String run() {
        final Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        boolean enterZero = true;

        do {
            System.out.println("Enter a random number: ");
            final int n = scanner.nextInt();
            if (n != 0) { array.add(n); }
            else { enterZero = false; }
        } while (enterZero);

        int sum = 0;
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < array.toArray().length; i++) {
            sum += array.get(i);
            list.append(array.get(i)).append(", ");
        }

        StringBuilder result = new StringBuilder();
        return result
                .append("sum is: ").append(sum).append(" ")
                .append("the num are: ").append(list).append(" ")
                .append("the size is: ").append(array.size())
                .toString();
    }
}
