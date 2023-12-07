package Seminar5;

import java.util.HashMap;
import java.util.Map;

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXIX = 2019



public class Task4 {
    public static int yearConvert(String yearArabic) {
        Map<Character, Integer> arabicNumbers = getArabicNumbers();
        int year = 0;
        for (int i = yearArabic.length() - 1; i > 0; i--) {
            int yearOne = arabicNumbers.get(yearArabic.charAt(i)), yearTwo = arabicNumbers.get(yearArabic.charAt(i-1));
            if (yearOne > yearTwo){
                year += yearOne - yearTwo;
            }
            else {
                year += yearTwo;
            }
        }
        return year;
    }

    private static Map<Character, Integer> getArabicNumbers() {
        Map<Character, Integer> arabicNumbers = new HashMap<>();
        arabicNumbers.put('I', 1);
        arabicNumbers.put('V', 5);
        arabicNumbers.put('X', 10);
        arabicNumbers.put('L', 50);
        arabicNumbers.put('X', 10);
        arabicNumbers.put('C', 100);
        arabicNumbers.put('D', 500);
        arabicNumbers.put('M', 1000);

        return arabicNumbers;
    }

    public static void main(String[] args) {
        String yearArabic = "MMXXXIV";
        System.out.println(yearConvert(yearArabic));
    }
}
