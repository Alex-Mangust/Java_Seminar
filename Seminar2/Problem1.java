// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminar2;

public class Problem1 {

    public static StringBuilder StringBuilderChar(char c1, char c2, int len) {
        StringBuilder str = new StringBuilder(len);
        for (int i = 0; i < len / 2; i++) {
            str.append(c1).append(c2);
        }
        return str;
    }

    public static String StringChar(char c1, char  c2, int len){
        String str = "";
        for (int i = 0; i < len; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

        return str;
    }

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 100000;
        if (n % 2 == 0){
            long time = System.currentTimeMillis();
            StringBuilderChar(c1, c2, n);
            // System.out.println(StringBuilderChar(c1, c2, n));
            System.out.println(System.currentTimeMillis() - time);
            System.out.println();
            long timeSecond = System.currentTimeMillis();
            StringChar(c1, c2, n);
            // System.out.println(StringChar(c1, c2, n));
            System.out.println(System.currentTimeMillis() - timeSecond);
        }
        else
            System.out.println("Введите четное число!");
    }

}