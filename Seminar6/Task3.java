package Seminar6;

// 📌 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько
// экземпляров этого класса, выведите их в консоль.
// 📌 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.util.ArrayList;

class Cat {
    String name;
    int age;
    private String breed;
    private String owner;
    private String color;
    private ArrayList<String> vactination;
    private ArrayList<String> historyMedical;

    public Cat(String name, int age, String breed, String owner, String color) {
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
    
}

public class Task3 {
    public static void main(String[] args) {
        Cat catOne = new Cat("Барсик", 2, "Сиамский", "Иван", "Белый");
        Cat catTwo = new Cat("Рыжик", 1, "Мэйн-Кун", "Ирина", "Рыжий");
        Cat catThree = new Cat("Мурка", 0, "-", "Василий", "Черный");

        System.out.println(catOne);
        System.out.println();
        System.out.println(catTwo);
        System.out.println();
        System.out.println(catThree);
    }
}
