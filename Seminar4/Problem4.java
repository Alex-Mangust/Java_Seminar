package Seminar4;
// 📌 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 📌 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem4 {
    public static void stackArray(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        for (int elem : arr) {
            st.push(elem);
        }
        System.out.print("Содержимое стека: ");
        while (!st.isEmpty()) System.out.print(st.pop() + " ");
    }

    public static void queueArray(int[] arr) {
        Queue<Integer> qu = new ArrayDeque<Integer>();
        for (int elem : arr) {
            qu.offer(elem);
        }
        System.out.print("Содержимое очереди: ");
        while (!qu.isEmpty()) System.out.print(qu.poll() + " "); 
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        stackArray(arr);
        System.out.println();
        queueArray(arr);
    }
}
