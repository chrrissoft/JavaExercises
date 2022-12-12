import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) throws ParseException {
        System.out.println(run());
    }

    /**
     * if all the months have 30 days, then the year has 360 instead of 365
     * <p>
     * for every year we increment 360 to the counter
     * <p>
     * if the number of the months increases: we multiply the number
     * of increases by 30 and add it to the counter
     * <p>
     * if the number of the month decreases: we multiply the number
     * of decrements by 30 and subtract it from the counter
     * <p>
     * if number of the day increases: we add the number
     * of increases to the counter
     * <p>
     * if number of the day decreases: we subtract the number
     * of decrements to the counter
     **/
    private static String run() throws ParseException {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial date for example: 11/17/2022 -> ");
        String date1 = scanner.nextLine();
        validDate(date1);
        System.out.println("Enter the second date for example: 11/17/2022 -> ");
        String date2 = scanner.nextLine();
        validDate(date2);
        date1 = date1.replace("/", "");
        date2 = date2.replace("/", "");

        int date1InNumber = Integer.parseInt(date1);
        int date2InNumber = Integer.parseInt(date2);

        if (date1InNumber > date2InNumber) {
            throw new IllegalArgumentException("second date must be greater than or equal");
        }

        int counter = 0;

        String firstDayString = String.valueOf(date1.charAt(0)) + date1.charAt(1);
        String firstMonthString = String.valueOf(date1.charAt(2)) + date1.charAt(3);
        String firstYearString = String
                .valueOf(date1.charAt(4)) + date1.charAt(5) + date1.charAt(6) + date1.charAt(7);

        int firstDayNumber = Integer.parseInt(firstDayString);
        int firstMonthNumber = Integer.parseInt(firstMonthString);
        int firstYearNumber = Integer.parseInt(firstYearString);

        String secondDayString = String.valueOf(date2.charAt(0)) + date2.charAt(1);
        String secondMonthString = String.valueOf(date2.charAt(2)) + date2.charAt(3);
        String secondYearString = String
                .valueOf(date2.charAt(4)) + date2.charAt(5) + date2.charAt(6) + date2.charAt(7);


        int secondDayNumber = Integer.parseInt(secondDayString);
        int secondMonthNumber = Integer.parseInt(secondMonthString);
        int secondYearNumber = Integer.parseInt(secondYearString);

        counter += (secondYearNumber - firstYearNumber) * 360;

        if (firstMonthNumber > secondMonthNumber) {
            final int monthsIncreases = (secondMonthNumber - firstMonthNumber) * 30;
            counter += monthsIncreases;
        } else {
            final int monthsDecrements = (firstMonthNumber - secondMonthNumber) * 30;
            counter -= monthsDecrements;
        }

        if (firstMonthNumber > secondMonthNumber) {
            final int dayIncreases = secondDayNumber - firstDayNumber;
            counter += dayIncreases;
        } else {
            final int dayDecrements = firstDayNumber - secondDayNumber;
            counter -= dayDecrements;
        }

        return "It is been " + counter + " days";
    }

    private static void validDate(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        dateFormat.parse(date);
    }

}
