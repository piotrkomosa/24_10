package excer3;

public class ConverterTest {
    public static void main(String[] args) {

        CalandarConverter calandarConverter = new CalandarConverter();

        for (int dayNumber = 1; dayNumber < 8; dayNumber++) {
            System.out.println(dayNumber + " dzień tygodnia to " + calandarConverter.convertDayToString(dayNumber));
        }

    }

}
