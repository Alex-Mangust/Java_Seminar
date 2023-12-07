package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

// 📌 Напишите метод, который вернет содержимое текущей папки в виде массива строк.

// 📌 Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.

// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

public class Task5 {
    static Logger logger = Logger.getLogger(Task5.class.getName());

    public static String[] directoryInfo(String fileName) {
        File directory = new File(fileName);
        String[] directoryContent = directory.list();
        return directoryContent;
    }

    static void SettingLogger() {
        try {
            FileHandler log = new FileHandler("C:\\Users\\Саня\\Desktop\\Учеба\\Программирование. Специализация\\Знакомство с языком Java и как пользоваться базовым API (семинары)\\Seminar2\\log.txt");
            logger.addHandler(log);
            SimpleFormatter sformatter = new SimpleFormatter();
            log.setFormatter(sformatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SettingLogger();
        String fileName = ".";
        try (FileWriter writer = new FileWriter(
                "C:\\Users\\Саня\\Desktop\\Учеба\\Программирование. Специализация\\Знакомство с языком Java и как пользоваться базовым API (семинары)\\Seminar2\\directoryInfo.txt")) {
            for (int i = 0; i < directoryInfo(fileName).length; i++) {
                writer.write(directoryInfo(fileName)[i]);
                writer.write("\n");
            }
            writer.flush();
            logger.info("Данные успешно записаны!");
        } catch (Exception e) {
            logger.info("Ошибка! Данные не удалось записанать!" + "\n" + e.getMessage());
        }
    }
}
