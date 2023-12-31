package Seminar3.HomeworkSem3;

import java.util.Arrays;

import java.util.ArrayList;

// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, удаляла бы из него четные числа и выводила список без четных чисел.

// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:

// Integer[] arr - список целых чисел

// Пример


// arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
// removeEvenNumbers(arr);

// // [1, 3, 5, 7, 9]

// arr = new Integer[]{2, 4, 6, 8};
// removeEvenNumbers(arr);

// // []

class AnswerOne {
    public static void removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
        // ArrayList<Integer> list = Arrays.asList(arr);
        java.util.List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        java.util.Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            if (col.next() % 2 == 0){
                col.remove();
            }
        }
        System.out.println(list);
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      AnswerOne ans = new AnswerOne();      
      ans.removeEvenNumbers(arr);
    }
}