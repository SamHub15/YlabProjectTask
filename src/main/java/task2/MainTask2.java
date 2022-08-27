package task2;

public class MainTask2 {

    public static void main(String[] args) {

        int[] array = {5,6,3,2,5,1,4,9};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swap(j, j+1, array);
                }
    }

    public static void swap(int one, int two, int[] array) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public static void printArray(int[] array) {
        for (int i=0; i< array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
