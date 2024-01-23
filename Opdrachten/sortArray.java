import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] empty = {};
        int[] singleValue = {23};
        int[] twoValue = {9, 21};
        int[] tenValue  = {9, 21, 23, 56, 12, 89, 67, 34, 78, 9, 21};
        int[] negativeValue = {-9, -21, -23, -56, -12, -89, -67, -34, -78, -9, -21};
        System.out.println("Array before sorting: " + Arrays.toString(negativeValue));

        int grootsteGetal = sortArray(negativeValue);
        if (grootsteGetal == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Largest number in the array: " + grootsteGetal);
        }
    }

    public static int sortArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int grootsteGetal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > grootsteGetal) {
                grootsteGetal = array[i];
            }
        }
        return grootsteGetal;
    }
}
