import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static String run() {

        double x1, x2;

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        int d = (int) Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        x1 = -(b) + d;
        x2 = -(b) - d;
        x1 = x1 / 2 * a;
        x2 = x2 / 2 * a;

        return "x1: " + x1 + " x2: " + x2;
    }
}
