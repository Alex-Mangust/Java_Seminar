package Seminar5;
// 📌 Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// 📌 Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        Map<String, String> pasportDate = new HashMap<>();
        pasportDate.put("123456", "Иванов");
        pasportDate.put("321456", "Васильев");
        pasportDate.put("234561", "Петрова");
        pasportDate.put("234432", "Иванов");
        pasportDate.put("654321", "Петров");
        pasportDate.put("345678", "Иванова");
         pasportDate.put("321456", "Васильева");
        
        for (String pasportNum : pasportDate.keySet()) {
            String name = pasportDate.get(pasportNum);
            String find = "Иванов";
            boolean f = true;
            for (int i = 0; i < find.length(); i++) {
                if (name.charAt(i) != find.charAt(i))
                    f = false;
            }
            if (f)
                System.out.println("Номер паспорта: " + pasportNum + ", Фамилия: " + name);
        }
    }
}
