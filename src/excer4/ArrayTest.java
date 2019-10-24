package excer4;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        double[][] array3 = {{1, 2, 3, 4}, {1, 4, 6, 7}};
        double[][] array4 = {{1, 2, 3, 4}, {1, 4, 6, 7}};

        ArrayComparator arrayComparator = new ArrayComparator();
        System.out.println(arrayComparator.compare(array1, array2));
        System.out.println(arrayComparator.compare(array3, array4));
    }
}
