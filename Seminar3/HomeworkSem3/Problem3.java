package Seminar3.HomeworkSem3;

import java.util.Arrays;
import java.util.ArrayList;

// Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:

// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

// Integer[] arr - список целых чисел

class AnswerTwo {
    public static void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
        int max = 0, min = Integer.MAX_VALUE, average = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(arr[i], arr[i+1]);
            min = Math.min(min, arr[i]);
            average += arr[i];
        }
        average += arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        java.util.List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        System.out.printf("Minimum is %d%n", min);
        System.out.printf("Maximum is %d%n", max);
        System.out.printf("Average is = %d%n", average / arr.length);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Problem3{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      AnswerTwo ans = new AnswerTwo();      
      ans.analyzeNumbers(arr);
    }
}