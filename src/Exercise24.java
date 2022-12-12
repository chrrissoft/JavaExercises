import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise24 {

    private static final int LIMIT = 10;

    static int[] array = new int[LIMIT];

    public static void main(String[] args) {
        array = getData(array);
        printData(array);
    }

    private static int[] getData(int[] array) {
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < LIMIT; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printData(int[] array) {
        AtomicInteger i = new AtomicInteger();
        ArrayList<Integer> list = new ArrayList<>();

        for (int value : array) {
            list.add(value);
        }

        list.forEach( e -> {
            System.out.println("Index: " + i + " element: " + e);
            i.set(i.get() + 1);
        });
    }
}
