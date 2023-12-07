package HomeworkSem1;

class AnswerTwo {
    public void printPrimeNums() {
        // Напишите свое решение ниже
        for (int i = 2; i < 100; i++) {
            boolean t = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    t = false;
            }
            if (t == true)
                System.out.println(i);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {

        AnswerTwo ans = new AnswerTwo();
        ans.printPrimeNums();
    }
}