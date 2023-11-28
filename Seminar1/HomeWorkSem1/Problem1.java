package HomeworkSem1;
// package Seminar1.HomeworkSem1;

class Answer {
    public int countNTriangle(int n){
      // Введите свое решение ниже
      int a = 0;
        for (int i = 1; i < n; i++){
            a = i+1;
            for (int j = 1; j < i+1; j++){
                a += j;
            }
        }
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Problem1{ 
    public static void main(String[] args) { 
      int n = 0;
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        n = 6;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     
      
        // Вывод результата на экран
      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}