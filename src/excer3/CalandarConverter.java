package excer3;

public class CalandarConverter {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNSDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Poniedziałek";
            case 2:
                return "Wtorek";
            case 3:
                return "Sroda";
            case 4:
                return "Czwartek";
            case 5:
                return "Piatek";
            case 6:
                return "Sobota";
            case 7:
                return "Niedziela";
        }
        return null;
    }
}


