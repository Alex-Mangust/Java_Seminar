package Seminar4;
// 📌 Реализовать стэк с помощью массива.

// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class Problem5 {

    public static int size(int[] arr) {
        return arr.length;
    }

    
    public static boolean empty(int[] arr) {
        boolean emptyArr = false;
        if (arr.length == 0)
        emptyArr = true;
        return emptyArr;
    }
    
    public static int[] push(int elem, int[] arr) {
        int[] arrSecond = new int[arr.length + 1];
        for (int i = 1; i < arrSecond.length; i++) {
            arrSecond[i] = arr[i - 1];
        }
        arrSecond[0] = elem;
        return arrSecond;
    }

    public static int peek(int[] arr) {
        return arr[0];
    }

    public static int[] pop(int[] arr) {
        System.out.println(arr[0]);
        int[] arrSecond = new int[arr.length - 1];
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = arr[i+1];
        }
        return arrSecond;
    }
    public static void main(String[] args) {
        int[] arr = new int[0];
        System.out.println(size(arr));
        System.out.println(empty(arr));
        arr = push(0, arr);
        arr = push(1, arr);
        arr = push(2, arr);
        arr = push(3, arr);
        arr = push(4, arr);
        arr = push(5, arr);
        System.out.println(size(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(" ");
            else
                System.out.println();
        }
        System.out.println(peek(arr));
        System.out.println(empty(arr));

        arr = pop(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(" ");
            else
                System.out.println();
        }

    }
}
