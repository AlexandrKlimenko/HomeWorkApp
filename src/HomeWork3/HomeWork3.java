package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        arr1();
        oneHundred();
        multiplyTheNumber();
        squareArray();
        receiving(5, 6);


    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
     * и условия заменить 0 на 1, 1 на 0;
     */
    public static void arr1() {
        int[] arr = {0, 1, 1, 0, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i] - 1;
            }
        }
    }


    /**
     * 2.Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void oneHundred() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr2));

    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void multiplyTheNumber() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void squareArray() {
        int[][] array4 = new int[5][5];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
                System.out.printf("%3d", array4[i][j]);

            }

            System.out.println();
        }

    }

    /**5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */

    public static int[] receiving(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
}