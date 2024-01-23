public class binarySearch {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 26;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if(index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at index " + index);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int begin = 0;
        int end = array.length - 1;

        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            int value = array[middle];
            System.out.println("middle " + value);

            if (value < target) begin = middle + 1;
            else if (value > target) end = middle -1;
            else return middle; //Target is found

        }
        return -1;
    }
}
