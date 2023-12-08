package Seminar6;

import java.util.HashSet;
import java.util.Random;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

public class Task2 {

    public static void setArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0, 24);
        }
    }

    public static double countUnicalNum(int[] arr) {
        HashSet<Integer> countUn = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            countUn.add(arr[i]);
        }
        double sizeCountUn = countUn.size();
        double lengthArr = arr.length;
        double unicalNum = sizeCountUn * (100/lengthArr);

        return unicalNum;
    }
    public static void main(String[] args) {
        int[] arrayRandNum = new int[1000];
        setArray(arrayRandNum);
        System.out.println(countUnicalNum(arrayRandNum) + "%");
        
    }
}
