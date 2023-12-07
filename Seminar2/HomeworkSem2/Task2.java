// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
// int[] arr - числовой массив
// После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.

package Seminar2.HomeworkSem2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public void sort(int[] mas) {
        try {
            log = new File("C:\\Users\\Саня\\Desktop\\Учеба\\Программирование. Специализация\\Знакомство с языком Java и как пользоваться базовым API (семинары)\\Seminar2\\HomeworkSem2\\log.txt");
            fileWriter = new FileWriter(log);
            Date d = new Date();
            String result = "";
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd H:m");
            boolean end = true;
            for (int i = 1; i < mas.length; i++) {
                end = true;
                for (int j = 0; j < mas.length - i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        end = false;
                    }
                }
                if (end == true){
                    i = mas.length;
                }
                if (!end){
                    result += date.format(d) + " " + Arrays.toString(mas);
                    result += "\n";
                }
            }
            result += date.format(d) + " " + Arrays.toString(mas);
            fileWriter.write(result);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[] { 9, 4, 8, 3, 1 };
            // arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Саня\\\\Desktop\\\\Учеба\\\\Программирование. Специализация\\\\Знакомство с языком Java и как пользоваться базовым API (семинары)\\\\Seminar2\\\\HomeworkSem2\\\\log.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
        System.out.println(line);
        }
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}