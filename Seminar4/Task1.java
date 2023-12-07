package Seminar4;

import java.util.*;
// 📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

public class Task1 {
    public static long getArrayTimeFirst(int count){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Date date = new Date();
        for (int i = 0; i < count; i++) {
            arr.addFirst(i);
        }
        Date date2 = new Date();
        long time = date2.getTime() - date.getTime();
        return time;
    }
    public static long getLinkedTimeFirst(int count){
        LinkedList<Integer> link = new LinkedList<Integer>();
        Date date = new Date();
        for (int i = 0; i < count; i++) {
            link.addFirst(i);
        }
        Date date2 = new Date();
        long time = date2.getTime() - date.getTime();
        return time;
    }

    public static long getArrayTimeMiddle(int count){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Date date = new Date();
        for (int i = 0; i < count; i++) {
            arr.add(arr.size()/2, i);
        }
        Date date2 = new Date();
        long time = date2.getTime() - date.getTime();
        return time;
    }
    public static long getLinkedTimeMiddle(int count){
        LinkedList<Integer> link = new LinkedList<Integer>();
        Date date = new Date();
        for (int i = 0; i < count; i++) {
            link.add(link.size()/2, i);
        }
        Date date2 = new Date();
        long time = date2.getTime() - date.getTime();
        return time;
    }



    public static long getArrayTimeLast(int count){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Date date = new Date();
        for (int i = 0; i < count; i++) {
            arr.addLast(i);
        }
        Date date2 = new Date();
        long time = date2.getTime() - date.getTime();
        return time;
    }
    public static long getLinkedTimeLast(int count){
        LinkedList<Integer> link = new LinkedList<Integer>();
        Date date = new Date();
        for (int i = 0; i < count; i++) {
            link.addLast(i);
        }
        Date date2 = new Date();
        long time = date2.getTime() - date.getTime();
        return time;
    }

    public static void printTime(long time){
        long m = 0, s = 0, ms = 0;
        if (time < 1000) {
            ms = time;
            System.out.println(ms + "мс");
        }
        else if (time == 1000) {
            s = time / 1000;
            System.out.println(s + "с");
        }
        else if (time > 1000 && time < 60000){
            s = time / 1000;
            ms = time % 1000;
            System.out.println(s + "с " + ms + "мс");
        }
        else if (time == 60000) {
            m = time / 60000;
            System.out.println(m + "м");
        }
        else if (time > 60000 && time < 360000) {
            m = time / 60000;
            if ((time % 60000)/1000 != 0) {
                s = (time % 60000) / 1000;
                ms = (time % 60000) % 1000;
                 System.out.println(m + "м " + s + "с " + ms + "мс");
            }
            else if (((time % 60000)%1000 != 0) && ((time % 60000)/1000 == 0))  {
                ms = (time % 60000) % 1000;
                System.out.println(m + "м " + ms + "мс");
            }
            else {
                s = (time % 60000) / 1000;
                System.out.println(m + "м " + s + "с ");
            }
        }
    }

    public static void differend(long timeFirst, long timeSecond){
        if (timeFirst < timeSecond) {
            long differend = timeSecond - timeFirst;
            System.out.print("ArrayList быстрее LinkedList на ");
            printTime(differend);
        } else if (timeFirst > timeSecond) {
            long differend = timeFirst - timeSecond;
            System.out.print("LinkedList быстрее ArrayList на ");
            printTime(differend);
        } else System.out.print("LinkedList и ArrayList выполнили работу с одинаковой скоростью");
    }

    public static void main(String[] args) {
        int count = 200000;

        long timeArr = getArrayTimeFirst(count);
        long timeLink = getLinkedTimeFirst(count);
        System.out.print("Добавление в начало. ArrayList выполнил работу за ");
        printTime(timeArr);
        System.out.print("Добавление в начало. LinkedList выполнил работу за ");
        printTime(timeLink);
        differend(timeArr, timeLink);
        System.out.println();

        timeArr = getArrayTimeMiddle(count);
        timeLink = getLinkedTimeMiddle(count);
        System.out.print("Добавление в середину. ArrayList выполнил работу за ");
        printTime(timeArr);
        System.out.print("Добавление в середину. LinkedList выполнил работу за ");
        printTime(timeLink);
        differend(timeArr, timeLink);
        System.out.println();

        timeArr = getArrayTimeLast(count);
        timeLink = getLinkedTimeLast(count);
        System.out.print("Добавление в конец. ArrayList выполнил работу за ");
        printTime(timeArr);
        System.out.print("Добавление в конец. LinkedList выполнил работу за ");
        printTime(timeLink);
        differend(timeArr, timeLink);
    }
}
