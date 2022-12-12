import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static String run() {
        final Scanner scanner = new Scanner(System.in);
        final String greeting = "Hello";
        final String name = scanner.next();
        return "Hello, " + name;
    }

}

