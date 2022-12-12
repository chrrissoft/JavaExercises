import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int count = 0;
        final int limit = 3;
        final String password = "password";
        final Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter password: ");
            final String pass = scanner.next();
            if (!pass.equals(password)) {
                count++;
                final int attemptsLeft = limit - count;
                if (count == limit) {
                    System.out.println("Access denied 🤐");
                } else {
                    System.out.println("Password is incorrect, you have " + attemptsLeft + " attempts left");
                }
            } else {
                System.out.println("you are in 🎉");
                return;
            }
        } while (count < limit);
    }

}
