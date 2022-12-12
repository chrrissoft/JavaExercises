public class Exercise2 {

    public static void main(String[] args) {
        System.out.println(run(1, 0));
        System.out.println(run(1, 10));
        System.out.println(run(10, 10));
    }

    static String run(int n1, int n2) {

        String result =
                (n1 > n2)
                ? "first is greater that second"
                    : ( n1 < n2 ) ? "second is greater that first"
                : "both are equal";

        return result;
    }

}

