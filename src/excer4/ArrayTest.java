package excer4;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array1 ={1,2,3,4};
        int[] array2 ={1,2,6,4};

        ArrayComparator arrayComparator = new ArrayComparator();
        System.out.println(arrayComparator.compare(array1,array2));
    }
}
