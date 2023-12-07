package Seminar2;
import java.io.FileWriter;
// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
import java.io.IOException;

public class Task4 {
    public static String TestString(String str) {
        int len = 100;
        StringBuilder sb = new StringBuilder(len * 2); 
        for (int i = 0; i < len * 2; i++) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "TEST";
        try (FileWriter writer = new FileWriter("C:\\Users\\Саня\\Desktop\\Учеба\\Программирование. Специализация\\Знакомство с языком Java и как пользоваться базовым API (семинары)\\Seminar2\\file.txt", false)){
            writer.write(TestString(word));
            writer.flush();
            System.out.println("Данные успешно записаны!");
        } catch (IOException ex) {
            System.out.println("Ошибка! Данные не удалось записать!");
        }
    }
}
