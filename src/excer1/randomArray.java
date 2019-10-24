package excer1;
import java.util.Random;
public class randomArray {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[2];
        int j = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            if (i <= j) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.print(numbers[j] + " ");
                if (i == 1) {
                    i = numbers.length + 2;
                }
                i = i - 2;
                j--;
            }
        }
    }
}
