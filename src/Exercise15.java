import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        final Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter a number: ");
            n = scanner.nextInt();
        } while(n < 0);

        System.out.println(n);
    }

}
