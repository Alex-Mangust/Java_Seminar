package Seminar5;
// 📌 Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Map;
public class Task2 {

    public static boolean izo(String s, String t) {
        if (s.equals(t)) return true;
        else if (s.length() == t.length()) {
            Map<Character, Integer> iz = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                iz.put(s.charAt(i), i);
            }
            
            Map<Character, Integer> iz2 = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                iz2.put(t.charAt(i), i);
            }
            boolean izoResult = true;
            for (Character key: iz.keySet()) {
                int a = iz.get(key), b = iz2.get(key);
                if (a != b)
                    System.out.println("FALSE!");
            }

            // for (Character a : iz.keySet()) {
            //     System.out.println(a + " " + iz.get(a));
            // }
            // System.out.println();

            // for (Character b : iz2.keySet()) {
            //     System.out.println(b + " " + iz2.get(b));
            // }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "paper", t = "title";
        izo(s, t);
    }
}
