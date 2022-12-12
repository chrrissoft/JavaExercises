public class Exercise17 {

    public static void main(String[] args) {
        System.out.println(run(DaysOfWeek.MONDAY));
        System.out.println(run(DaysOfWeek.FRIDAY));
        System.out.println(run(DaysOfWeek.SUNDAY));
    }

    private static String run(DaysOfWeek day) {
         return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY -> {
                yield  "It is day of work";
            }
            case SUNDAY -> {
                yield  "It is not day of work";
            }
        };
    }

    private enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
