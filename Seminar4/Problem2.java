package Seminar4;
// 📌 Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

    public static boolean getList(String input, ArrayList<String> arr, boolean run) {
        String del[] = input.split("~");
        if (input.equals("print")){
            System.out.println(arr);
            Scanner next = new Scanner(System.in);
            System.out.println("Продолжить?\1 - да   2 - нет");
            int a = next.nextInt();
            if (a != 1) run = false;
            next.close();
        }
        else if (del[0].equals("print")){
            if (isNumber(del[1])) {
                if ((Integer.parseInt(del[1]) < arr.size()) && !(arr.get(Integer.parseInt(del[1])).equals(""))) {
                    System.out.println(arr.get(Integer.parseInt(del[1])));
                    arr.remove(Integer.parseInt(del[1]));
                }
                else System.out.println("Ошибка! Такого элемента нет в списке!");
            }
            else System.out.println("Ошибка! num должно быть числом!");
        }
        else {
            boolean find = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '~')
                    find = true;
            }
            if (find) {
                String in[] = input.split("~");
                if (isNumber(in[1])) {
                    boolean addIn = false;
                    while (!addIn) {
                        if (Integer.parseInt(in[1]) > arr.size()) {
                            for (int i = 0; i < Integer.parseInt(in[1]); i++) {
                                arr.add(i, "");
                            }
                        }
                        addIn = true;
                    }
                    arr.add(Integer.parseInt(in[1]), in[0]);
                    if (arr.size() > Integer.parseInt(in[1]) + 1) arr.remove(Integer.parseInt(in[1])+1);
                }
                else System.out.println("Ошибка! num должно быть числом!");
            }
            else System.out.println("Ошибка! В строке отсутствует \'~\'!");

        }
        return run;

    }

    public static boolean isNumber(String in) {
        try {
            Integer.parseInt(in);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        Boolean run = true;
        while (run) {
            System.out.println("Введите строку типа text~num: ");
            String input = sc.nextLine();
            run = getList(input, arr, run);
        }

        sc.close();
    }
}
