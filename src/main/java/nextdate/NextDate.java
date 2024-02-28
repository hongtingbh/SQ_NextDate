package nextdate;
public class NextDate {

    public static String nextDate(int day, int month, int year) {
        if (!isValidDate(day, month, year))
            throw new IllegalArgumentException("Invalid input");

        if (day < daysInMonth(month, year)) {
            return (day + 1) + "/" + month + "/" + year;
        } else if (month < 12) {
            return "1/" + (month + 1) + "/" + year;
        } else {
            return "1/1/" + (year + 1);
        }
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1812 || year > 2212 || month < 1 || month > 12)
            return false;
        return day >= 1 && day <= daysInMonth(month, year);
    }

    private static int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) || (year % 400 == 0);
    }
}
