package Seminar3.HomeworkSem3;

import java.util.Arrays;

// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

// Пример

// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        if (a == null) return null;
        if (a.length < 2) return a;
        int left[] = new int[a.length / 2];
        System.arraycopy(a, 0, left, 0, a.length / 2);
        int right[] = new int[a.length - (a.length / 2)];
        System.arraycopy(a, a.length / 2, right, 0, a.length - (a.length / 2));
        
        left = mergeSort(left);
        right = mergeSort(right);

        int[] result = new int[a.length];
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}