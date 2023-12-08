package Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// 📌 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 📌 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
// 6, 3}. Распечатайте содержимое данного множества.
// 📌 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> setH = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 8));
        System.out.println(setH);

        LinkedHashSet<Integer> setL = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 8));
        System.out.println(setL);

        TreeSet<Integer> setT = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 8));
        System.out.println(setT);
    }
}
