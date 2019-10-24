package excer4;
import java.util.Arrays;
public class ArrayComparator {

   public static boolean compare(int[] array1, int[] array2) {

        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }
    public  static boolean compare(double[][] array3, double[][] array4) {

        for (int i = 0; i < array3.length; i++) {
            if (!Arrays.equals(array3[i], array4[i]))
                return false;
        }
        return true;
    }
}