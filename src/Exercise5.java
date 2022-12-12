import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static String run() {

        final double PI = Math.PI;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radio: ");
        double radio = scanner.nextDouble();
        double area = (PI * Math.pow(radio, 2));
        area = Math.round(area);
        return "area is " + area;
    }

}

