package Seminar2;
// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class Problem3 {

    public static String Palindrom(String str){
        if (str.length() % 2 != 0) return "Строка не является палиндромом!";
        else{
            int end = str.length();
            for (int i = 0; i < end; i++) {
                if (!(str.charAt(i) == str.charAt(end - (i+1)))) return "Строка не является палиндромом!";
                if (i == (end/2) - 1) return "Строка является палиндромом!";
            }
            return "Строка является палиндромом!";
        }
    }
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(Palindrom(str));
    }
}
