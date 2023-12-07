package Seminar2;

// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.


public class Task2 {

    public static String StringMethod(String str){
        StringBuilder strSecond = new StringBuilder();
        int count = 1;        
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)){
                count++;
            }
            else{
                strSecond.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        strSecond.append(str.charAt(str.length()-1)).append(count);
        return strSecond.toString();
    }
        
    public static void main(String[] args) {
        String str = "aaaabbbcddiipooo";
        System.out.println(StringMethod(str));
    }
}
