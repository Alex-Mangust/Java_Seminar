package Seminar4;
// 📌 Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class Problem3 {
    public static boolean lineArray(String inLine, LinkedList<String> link, boolean run) {
        if (inLine.equals("print")) {
            if (link.size() > 0) {
                for (int i = link.size() - 1; i >= 0; i--) {
                    System.out.println(link.get(i));
                }
                // Scanner next = new Scanner(System.in);
                // System.out.println("Хотите продолжить?\n1 - да 2 - нет");
                // int nextIn = next.nextInt();
                // if (nextIn != 1) run = false;
                // next.close();
            } else System.out.println("В памяти нет ни одной строки");
        } else if (inLine.equals("revert")) {
            link.removeLast();
            System.out.println("Строка удалена!");
        } else if (inLine.equals("exit")) {
            run = false;
        } else if (inLine.equals("menu")) {
            System.out.println();
            menu();
        } else {
            link.add(inLine);
            System.out.println("Строка добавлена!");
        }
        return run;
    }
    public static void menu(){
        System.out.println("Данное приложение сохраняет введенные строки.\nЕсли ввести \"print\" - все сохраненные строки будут выведены в консоль, начиная с последней.\nЕсли ввести \"revert\" - последняя строка будет удалена из памяти. \nЕсли ввести \"exit\" - работа приложения будет остановлена\nЧтобы снова увидеть это меню, введите \"menu\"");
    }

    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        menu();
        while (run) {
            System.out.print("Введите строку: ");
            String inLine = sc.nextLine();
            run = lineArray(inLine, link, run);
        }
        sc.close();
    }
}
