import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();
    // Метод для добавления имени в HashMap
    HashMap<Integer, String> count = new HashMap<>();
    int i = 0;

    public void addName(String name) {
        this.count.put(i, name);
        i++;
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        for (int i = 0; i < count.size(); i++) {
            int countName = 1;
            boolean t = true;
            if (i != 0 && count.get(i).equals(count.get(i - 1)))
                t = false;
            if (t) {
                for (int j = i + 1; j < count.size(); j++) {
                    if (count.get(i).equals(count.get(j))) {
                        countName++;
                    }
                }
                this.names.put(count.get(i), countName);
            }
        }
        // StringBuilder result = new StringBuilder();
        // result.append("{");
        // for (String key : names.keySet()) {
        //     result.append(key);
        //     result.append("=");
        //     result.append(names.get(key));
        //     result.append(", ");
        // }
        // if (result.charAt(result.length()-2) == ',') {
        //     result.setLength(result.length()-1);
        //     result.setLength(result.length()-1);
        //     result.append("}");
        // } 
        // System.out.println(result.toString());
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (String key : names.keySet()) {
            result.append(String.format("%s = %s", key, String.valueOf(names.get(key))));
            result.append(", ");
        }
        if (result.charAt(result.length() - 1) == ' ' && result.charAt(result.length() - 2) == ',') {
            result.setLength(result.length() - 1);
            result.setLength(result.length() - 1);
            result.append("}");
        }
        System.out.println(result.toString());
        
    }
}

// Не удаляйте и не меняйте метод Main!
public class Task2 {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;

        if (args.length == 0) {
            name1 = "Elena";
            name2 = "Elena";
            name3 = "Elena";
            name4 = "Elena";
            name5 = "Ivan";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);

        namesCounter.addName(name5);
        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}