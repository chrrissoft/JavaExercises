import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static String run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a int: ");
        final int n = scanner.nextInt();
        return (n % 2 == 0) ? "the number is divisible" : "the number is not divisible";
    }

}
