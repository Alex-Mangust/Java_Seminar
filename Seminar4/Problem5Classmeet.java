package Seminar4;

/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
*/

public class Problem5Classmeet {
    public static void main(String[] args) {
        int size = 4;
        StackClass stack = new StackClass(size);

        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}

class StackClass {
    int[] array;
    int maxSize;
    int indexLast;

    public StackClass(int size) {
        this.maxSize = size;
        array = new int[size];
        indexLast = -1;
    }

    public int size() {
        return indexLast + 1;
    }

    public boolean empty() {
        return indexLast == -1;
    }

    public void push(int value) {
        array[++indexLast] = value;
    }

    public int peek() {
        return array[indexLast];
    }

    public int pop() {
        return array[indexLast--];
    }
}