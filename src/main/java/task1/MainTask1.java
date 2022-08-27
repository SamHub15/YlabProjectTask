package task1;

public class MainTask1 {
    public static void main(String[] args) {

        int[][] array = new int[10][10];
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array.length; j++) {
                array[i][j] = randomValue(20+i+j);
            }
        }
        printArray(array);
        findMaxValue(array);
        findMinValue(array);
        findAverageValue(array);
    }

    public static int findMaxValue(int[][] array) {
        int maxValue = array[0][0];
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                if (maxValue < anAnArr)
                    maxValue = anAnArr;
            }
        }
        System.out.println("Максимальное значение массива равно: " + maxValue);
        return maxValue;
    }
    public static int findMinValue(int[][] array) {
        int minValue = array[0][0];
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                if (minValue > anAnArr)
                    minValue = anAnArr;
            }
        }
        System.out.println("Минимальное значение массива равно: " + minValue);
        return minValue;
    }

    public static double findAverageValue(int[][] array) {
        double sum = 0;
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                sum+=anAnArr;
            }
        }
        System.out.println("Среднее значение массива равно: " + sum/count(array));
        return sum/count(array);
    }

    private static int count(int[][] array) {
        int result = 0;
        for (int[] m : array) {
            result += m.length;
        }
        return result;
    }

    public static int randomValue(int maxValue){
        int value;
        value = (int) (System.currentTimeMillis() % maxValue);
        value = (value * 32719 + 3) % 32749;
        return value % maxValue;
    }

    public static void printArray(int[][] array) {
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
