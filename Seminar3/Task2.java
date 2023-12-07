// Задание №2.1
// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    static void removePlanet(int i, List<String> list){
        for (int j = i+1; j < list.size(); j++) {       
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
    }
    static List<String> repeatPlanet(List<String> list){
        List listRep = new ArrayList();
        for (int i = 0; i < list.size(); i ++){
            int count = 1;
            for (int j = i+1; j < list.size(); j++) {       
                if (list.get(i).equals(list.get(j))) count++;
            }
            removePlanet(i, list);
            listRep.add(list.get(i) + " - " + count);
        }
        return listRep;
    }

    static void getPlanet(List<String> list){
        list.add("Земля");
        list.add("Венера");
        list.add("Уран");
        list.add("Нептун");
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Нептун");
        list.add("Сатурн");
        list.add("Земля");
        list.add("Марс");
        list.add("Сатурн");
        list.add("Марс");
        list.add("Венера");
        list.add("Земля");
        list.add("Уран");
        list.add("Уран");
        list.add("Венера");
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        getPlanet(list);
        System.out.println(list);
        System.out.println(repeatPlanet(list));
    }
}
