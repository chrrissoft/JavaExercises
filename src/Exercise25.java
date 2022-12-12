public class Exercise25 {

    private static final int LIMIT = 100;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int sum = 0;
        final int[] array = new int[LIMIT];
        for (int i = 1; i <= LIMIT; i++) {
            array[i - 1] = i;
            sum += array[i - 1];
        }

        final int average = sum / LIMIT;
        System.out.println("sum: " + sum + " average: " + average);
    }
}
