package Seminar4;
// 📌 Реализовать стэк с помощью массива.

// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().


public class Task5Class {
    public static void main(String[] args) {
        Stack arr = new Stack();
        System.out.println(arr.size());
        System.out.println(arr.empty());
        for (int i = 0; i < 10; i++) {
            arr.push(i);
        }
        System.out.println(arr.size());
        System.out.println(arr.empty());
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) System.out.print("Содержимое стека: [");
            System.out.print(arr.peek(i));
            if (i < arr.size() - 1) System.out.print(", ");
            else System.out.println("]");
        }
        System.out.println(arr.pop());
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) System.out.print("Содержимое стека: [");
            System.out.print(arr.peek(i));
            if (i < arr.size() - 1) System.out.print(", ");
            else System.out.println("]");
        }
    }
}

class Stack {
    int[] array;
    int size;
    int lastIndex;

    public Stack(){
        this.size = 0;
        array = new int[size];
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        if (size == 0) return true;
        else return false;
    }

    public void push(int elem) {
        int sizeSecond = size + 1;
        int[] arrSecond = new int[sizeSecond];
        for (int i = 1; i < arrSecond.length; i++) {
            arrSecond[i] = array[i - 1];
        }
        arrSecond[0] = elem;
        this.array = arrSecond;
        this.size = sizeSecond;
    }

    public int peek() {
        return array[0];
    }

    public int peek(int index) {
        return array[index];
    }
    
    public int pop() {
        int element = array[0];
        int[] arrSecond = new int[size - 1];
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = array[i+1];
        }
        this.array = arrSecond;
        this.size = size - 1;
        return element;
    }
}