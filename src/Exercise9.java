import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise9 {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int[] array = IntStream.range(1, 101).toArray();
        Arrays.stream(array).forEach(e -> {

                    final double in2 = e % 2;
                    final double in3 = e % 3;

                    if (in2 == 0) {
                        System.out.println("the number " + e + " is divisible in 2");
                    }
                    if (in3 == 0) {
                        System.out.println("the number " + e + " is divisible in 3");
                    }
                }
        );
    }

}
