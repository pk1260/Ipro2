public class mergeSort {
    public static void main(String[] args) {
        //Array met waarde die niet gesorteerd zijn.
        int array[] = {1, 3, 7, 4, 8, 1, 8, 6};

        //Roep de methode aan en print de gesorteerde array.
        mergeSort(array);

        //voor elk element in de array print het element.
        for (int j : array) {
            System.out.println(j + " ");
        }
    }

    public static void mergeSort(int array[]) {
        //Check of de array groter is dan 1.
        int length = array.length;
        if (length <= 1) return;

        //Pak het midden van de array.
        int middle = length / 2;

        //Maak een linker en rechter array.
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        //Vul de linker en rechter array.
        int i = 0; //Left array
        int j = 0; //Right array


        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

//        Check merge conditions
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
