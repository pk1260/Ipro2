import java.util.Arrays;

public class opdracht3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 4, 8, 1, 8, 6};

        System.out.println("dit is de array: " + Arrays.toString(array));

        int[] bergtopArray = bergtopArray(array);
        System.out.println("dit is de bergtopArray: " + Arrays.toString(bergtopArray));

        int aantalDalen = telDallen(array);
        System.out.println("Aantal dalen: " + aantalDalen);

        countDuplicate(array);

    }

    //    probleem 1
    public static int[] bergtopArray(int[] array) {
        int telToppen = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                telToppen++;
            }
        }

        int[] toppenArray = new int[telToppen];
        int currentIndext = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                toppenArray[currentIndext] = array[i];
                currentIndext++;
            }
        }

        return toppenArray;
    }

    //    probleem 2
    public static int telDallen(int[] array) {
        int countDallen = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                countDallen++;
            }
        }
        return countDallen;
    }

    //    probleem 3
    public static void countDuplicate(int array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                } else break;
            }
            if (count > 1) {
                System.out.println(array[i] + "->" + count + " keer");
            }
        }
    }
}
