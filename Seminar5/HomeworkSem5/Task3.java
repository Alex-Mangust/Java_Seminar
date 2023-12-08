import java.util.Arrays;
// 📌 Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:

// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.

// Сначала выводить исходный массив на экран.

// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.

// Выводить отсортированный массив на экран.

// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.

// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже
         int n = sortLength - 1;
        for (int i = n / 2; i >= 0; i--) {
          heapify(tree, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);
        int n = sortLength;
        for (int i=n-1; i>=0; i--)
        {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;
 
            // Heapify root element
            heapify(sortArray, i, 0);
        }

    }
}

// Не удаляйте и не меняйте метод Main!
public class Task3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[] { 12, 11, 13, 5, 6, 7 };
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}