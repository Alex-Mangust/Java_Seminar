package Seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

// 📌 Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
// 📌 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
// 📌 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
// должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 📌 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
// Objects.hash(...))
// 📌 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

class CatClassmeet {
    String name;
    int age;
    private String breed;
    private String owner;
    private String color;
    private ArrayList<String> vactination;
    private ArrayList<String> historyMedical;

    public CatClassmeet(String name, int age, String breed, String owner, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
        this.color = color;
        vactination = new ArrayList<String>();
        historyMedical = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<String> getVactination() {
        return vactination;
    }

    public ArrayList<String> getHistoryMedical() {
        return historyMedical;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 30) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Введен некорректный возраст!");
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVactination(String vaccine) {
        vactination.add(vaccine);
    }

    public void setHistoryMedical(String desease) {
        historyMedical.add(desease);
    }

    @Override
    public String toString() {
        return "Кличка - " + name + "\n"
                + "Окрас - " + color + "\n"
                + "Возраст - " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatClassmeet cat = (CatClassmeet) obj;
        return name.equals(cat.name) &&
                age == cat.age &&
                breed.equals(cat.breed) &&
                owner.equals(cat.owner) &&
                color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, owner, color);
    }

    public static void main(String[] args) {
        CatClassmeet catOne = new CatClassmeet("Барсик", 2, "Сиамский", "Иван", "Белый");
        CatClassmeet catTwo = new CatClassmeet("Рыжик", 1, "Мэйн-Кун", "Ирина", "Рыжий");
        CatClassmeet catThree = new CatClassmeet("Мурка", 0, "-", "Василий", "Черный");
        CatClassmeet catFour = new CatClassmeet("Мурка", 0, "-", "Василий", "Черный");
        CatClassmeet catFive = new CatClassmeet("Рыжик", 1, "Мэйн-Кун", "Ирина", "Рыжий");

        // System.out.println(catOne);
        // System.out.println();
        // System.out.println(catTwo);
        // System.out.println();
        // System.out.println(catThree);

        HashSet<CatClassmeet> catList = new HashSet<>(Arrays.asList(catOne, catTwo, catThree, catFour, catFive));
        for (CatClassmeet cat : catList) {
            System.out.println(cat);
            System.out.println();
        }
    }
}