public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("ADD " + run(Operation.ADD));
        System.out.println("SUB " + run(Operation.SUB));
        System.out.println("DIV " + run(Operation.DIV));
        System.out.println("MILT " + run(Operation.MILT));
        System.out.println("SUB " + run(Operation.SUB));
    }

    private static int run(Operation operation) {
        int one = 10;
        int two = 15;

        int result = switch (operation) {
            case ADD -> result = one + two;
            case SUB -> result = one - two;
            case DIV -> result = one / two;
            case MILT -> result = one * two;
            case MOD -> result = one % two;
        };

        return result;
    }

    private enum Operation {
        ADD, SUB, DIV, MILT, MOD
    }

}
