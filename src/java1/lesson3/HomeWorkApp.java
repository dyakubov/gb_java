package java1.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        String separator = "===================================";

        System.out.println("Задание 1");
        System.out.println(Arrays.toString(change0to1(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1})));
        System.out.println(separator);

        System.out.println("Задание 2");
        System.out.println(Arrays.toString(fill1to100()));
        System.out.println(separator);

        System.out.println("Задание 3");
        System.out.println(Arrays.toString(lessThen6(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println(separator);

        System.out.println("Задание 4");
        int[][] diagonals = diagonals(5);
        //Рисую квадрат для наглядности
        for (int[] diagonal : diagonals) {
            for (int j = 0; j < diagonals.length; j++) {
                System.out.print(diagonal[j] + " ");
            }
            System.out.println();
        }
        System.out.println(separator);

        System.out.println("Задание 5");
        System.out.println(Arrays.toString(initArr(10, 10)));
        System.out.println(separator);

        System.out.println("Задание 6");
        minMax(new int[]{1, 3, 30, 1, -5, 10, 12, 4});
        minMax(new int[]{1});
        System.out.println(separator);

        System.out.println("Задание 7");
        System.out.println(sumOfLeftAndRightSide(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(sumOfLeftAndRightSide(new int[]{1, 1, 1, 2, 1}));
        System.out.println(separator);

        System.out.println("Задание 8");
        System.out.println(Arrays.toString(moveArr(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(moveArr(new int[]{1, 2, 3, 4, 5}, 0)));
        System.out.println(Arrays.toString(moveArr(new int[]{1, 2, 3, 4, 5}, -3)));
    }

    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */
    public static int[] change0to1(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                result[i] = 1;
            } else {
                result[i] = a[i];
            }
        }
        return result;

    }

    /* 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100; */
    public static int[] fill1to100() {
        int[] result = new int[100];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; */
    public static int[] lessThen6(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                result[i] = a[i] * 2;
            } else result[i] = a[i];
        }
        return result;
    }

    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    public static int[][] diagonals(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (i == j) {
                    result[i][j] = 1;
                }
            }
            for (int j = size - 1; j >= 0; j--) {
                if (i + j == size - 1) {
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static int[] initArr(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    /* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */
    public static void minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j] && arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > arr[j] && arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);

    }

    /* 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. */
    public static boolean sumOfLeftAndRightSide(int[] arr) {
        int[] left = new int[arr.length]; //массив для левой части
        int[] right = new int[arr.length]; //массив для правой части
        int sumLeft = 0;
        int sumRight = 0;

        //Начинаем с первой цифры в массиве
        for (int i = 0; i < arr.length - 1; i++) {
            //Записываем в левую часть значания по порядку
            for (int j = i; j <= i; ) {
                left[j] = arr[j];
                sumLeft += left[j]; //приращиваем к сумме левой части текущее значение

                //Записываем в правую часть значения по порядку, отбросив левую часть
                for (int k = j + 1; k < arr.length; k++) {
                    right[k] = arr[k];
                    sumRight += right[k]; //суммируем правую часть
                }
                //Проверяем сумму левой и правой частей
                if (sumLeft == sumRight) {
                    return true;
                }
                sumRight = 0; //обнуляем сумму правой части
                j++; //разрешаем переход к следующему по порядку числу
                //Обнуляем значения "левее" текущей позиции в правой части массива
                if (j < arr.length) {
                    right[j] = 0;
                }
            }
        }
        return false;
    }

    /* 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами. */
    public static int[] moveArr(int[] arr, int steps) {
        //Проверяем, что число шагов не нулевое, а массив содержит более, чем 1 значение
        if (steps == 0 || arr.length == 1) {
            return arr;
            //Если количество шагов положительное, то перемещаем содержимое вправо
        } else if (steps > 0) {
            int buf;
            for (int i = 0; i < steps; i++) {
                for (int j = 0; j < arr.length; j++) {
                    buf = arr[arr.length - 1];
                    arr[arr.length - 1] = arr[j];
                    arr[j] = buf;
                }
            }
        } else {
            //Если количество шагов отрицательное, то перемещаем содержимое влево
            steps = Math.abs(steps);
            int buf;
            for (int i = 0; i < steps; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    buf = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buf;
                }
            }
        }
        return arr;
    }
}
