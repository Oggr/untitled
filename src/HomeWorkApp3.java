import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        change();
        System.out.println("---------------");
        hundred();
        System.out.println("---------------");
        twin();
        System.out.println("---------------");
        crossZero();
        System.out.println("---------------");
        int len = 6;
        int initialValue = 13;
        int[] array = createMassive(len, initialValue);
        System.out.println(Arrays.toString(array));
        System.out.println("---------------");
        minMax();
        System.out.println("---------------");
        System.out.println(balance(new int[] {2,2,0,0,3}));


    }

    private static void change() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = ((array[i] == 1) ? 0 : 1 );
        }
        System.out.println(Arrays.toString(array));
    }
    private static void hundred() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
           array[i] = i + 1;
        }
       System.out.println(Arrays.toString(array));

    }

    private static void twin() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < 6) {
                array[i] = value * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void crossZero() {
        int[][] array = new int[9][9];
        int lastNumber = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = array[i][lastNumber - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }

    }

    private static int[] createMassive(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;

    }

    private static void minMax() {
        int[] array = {12, 3, 3, 4, 66, 1, 2, 7};
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    private static boolean balance(int[] array) {
        boolean result = false;
        int leftSum = 0;
        int rightSum = sum(array,0,array.length);
        for (int j : array) {
            leftSum += j;
            rightSum -= j;
            if (leftSum == rightSum) {
                result = true;
                break;
            }
        }
        return result;
    }
    private static int sum(int[] array, int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
                sum += array[i];
        }
        return sum;
    }

    //восьмую не сдюжил, порыскал в нете до урока,
    // нашёл "на мой взгляд" более логичное решение у паренька на канале,
    // он случайно не из ваших? Больно чётко рассказывает.
    // https://www.youtube.com/watch?v=dQw4w9WgXcQ
}
