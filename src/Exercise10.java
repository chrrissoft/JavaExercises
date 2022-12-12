import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Exercise10 {

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static String run() {
        AtomicReference<Double> total = new AtomicReference<>(0.0);
        final ArrayList<Double> sales = new ArrayList<>();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers of sales: ");
        final double n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("enter the money of sale " + i);
            sales.add(scanner.nextDouble());
        }
        sales.stream().forEach(s -> {
            total.updateAndGet(v -> new Double((v + s)));
        });
        return "the total is " + Math.round(total.get() * 100.0) / 100.0;
    }

}
