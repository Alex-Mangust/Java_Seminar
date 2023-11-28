package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() и вывести его на
// экран.

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(1, 100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    
}