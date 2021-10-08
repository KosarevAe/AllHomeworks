import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth(5, 1);
        sixth();
        boolean seven = seventh(new int[]{2, 2, 2, 3, 2, 5, 6});
        System.out.println(seven);
    }

    public static void first() {
        int[] array = {0, 1, 0, 1, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void second() {
        int[] array = new int[100];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] += count + 1;
            count++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void third() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void fourth() {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, x = matrix[i].length - 1; j < matrix[i].length; j++, x--) {
                if (i == j || i == x) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void fifth(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void sixth() {
        int[] array = {100, 12, 23, 4, 5, 10, 11, 23, 2, -52, 2};
        int min = 0, max = 0;

        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
            if (max > array[i]) {
                max = array[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    public static boolean seventh(int[] array) {
        int countI = 0;
        int countJ = 0;

        for (int i = 0; i <= array.length - 3; i++) {
            countI += array[i];
        }

        for (int j = array.length - 1; j >= array.length - 2; j--) {
            countJ += array[j];
        }
        System.out.println(countI);
        System.out.println(countJ);

        if (countI == countJ) {
            return true;
        } else {
            return false;
        }
    }

}
