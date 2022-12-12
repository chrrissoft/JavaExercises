import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("Enter the work to convert: ");
        final Scanner scanner = new Scanner(System.in);
        final String work = scanner.nextLine();

        System.out.println("Choose the the operation");
        System.out.println("1 - To LowerCase");
        System.out.println("2 - To UpperCase");

        final int operation = scanner.nextInt();

        switch (operation) {
            case 1 -> System.out.println(work.toLowerCase());
            case 2 -> System.out.println(work.toUpperCase());
            default -> throw new IllegalArgumentException("Invalid operation");
        }
    }

}
