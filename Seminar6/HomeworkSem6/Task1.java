package Seminar6.HomeworkSem6;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Laptop {

    String firm;
    String CPU;
    String videoCard;
    String color;
    String countryOfManufacture;
    String operatingSystem;
    int RAM;
    int hardDrive;
    double screenDiagonal;
    double battery;
    int yearOfManufacture;
    String model;

    Laptop(String firm, String CPU, String videoCard, String color, String countryOfManufacture, String model, int RAM, int hardDrive, double screenDiagonal, double battery, int yearOfManufacture, String operatingSystem) {
        this.firm = firm;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.color = color;
        this.countryOfManufacture = countryOfManufacture;
        this.RAM = RAM;
        this.model = model;
        this.hardDrive = hardDrive;
        this.screenDiagonal = screenDiagonal;
        this.battery = battery;
        this.yearOfManufacture = yearOfManufacture;
        this.operatingSystem = operatingSystem;
    }
    Laptop(String firm, String CPU, String videoCard, String color, String countryOfManufacture, String model, int RAM, int hardDrive, double screenDiagonal, double battery, int yearOfManufacture) {
        this.firm = firm;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.color = color;
        this.countryOfManufacture = countryOfManufacture;
        this.RAM = RAM;
        this.model = model;
        this.hardDrive = hardDrive;
        this.screenDiagonal = screenDiagonal;
        this.battery = battery;
        this.yearOfManufacture = yearOfManufacture;
        this.operatingSystem = "Не установлена";
    }

    public String getFirm() {
        return firm;
    }
    public String getCPU() {
        return CPU;
    }
    public String getVideoCard() {
        return videoCard;
    }
    public String getColor() {
        return color;
    }
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }
    public String getModel() {
        return model;
    }
    public int getRAM() {
        return RAM;
    }
    public int getHardDrive() {
        return hardDrive;
    }
    public double getScreenDiagonal() {
        return screenDiagonal;
    }
    public double getBattery() {
        return battery;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Ноутбук - " + model + "\n"
        + "Фирма - " + firm + "\n"
        + "Процессор - " + CPU + "\n"
        + "Видеокарта - " + videoCard + "\n"
        + "Цвет - " + color + "\n"
        + "Страна изготовления - " + countryOfManufacture + "\n"
        + "Оперативная память - " + RAM + " гб.\n"
        + "Объем жесткого диска - " + hardDrive + " гб.\n"
        + "Диагональ экрана - " + screenDiagonal + " д.\n"
        + "Батарея - " + battery + " Вт*ч\n"
        + "Год изготовления - " + yearOfManufacture + " г.\n"
        + "Операционная система - " + operatingSystem;
    }

    @Override
    public boolean equals(Object l) {
        if (this == l) {
            return true;
        }
        if (l == null || getClass() != l.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) l;
        return firm.equals(laptop.firm) &&
        CPU.equals(laptop.CPU) &&
        videoCard.equals(laptop.videoCard) &&
        color.equals(laptop.color) &&
        countryOfManufacture.equals(laptop.countryOfManufacture) &&
        RAM == laptop.RAM &&
        hardDrive == laptop.hardDrive &&
        screenDiagonal == laptop.screenDiagonal &&
        battery == laptop.battery &&
        yearOfManufacture == laptop.yearOfManufacture &&
        operatingSystem.equals(laptop.operatingSystem);
    }
    
    @Override
    public int hashCode() {
            return Objects.hash(firm, CPU, videoCard, color, countryOfManufacture, RAM, hardDrive, screenDiagonal, battery, yearOfManufacture, operatingSystem);
        }
    }
public class Task1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("DEXP", "Intel Celeron N4020", "Intel UHD Graphics 600", "Silver", "China", "DEXP Aquilon",8 , 128, 14.1, 37, 2022, "Windows 11 Pro");
        Laptop laptop2 = new Laptop("GIGABYTE", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "China", "GIGABYTE G5 MF", 16, 512,  15.6, 54, 2023);
        Laptop laptop3 = new Laptop("ASUS", "Intel Core i5-1235U", "Intel Iris Xe Graphics", "Blue", "China", "ASUS Vivobook X1704ZA-AU123", 16, 512, 17, 50, 2023, "Windows 10");
        Laptop laptop4 = new Laptop("Fujitsu", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "Japan", "Fujitsu LIFEBOOK E5412", 32, 4096, 14, 60, 2021, "Windows 11");
        Laptop laptop5 = new Laptop("Apple", "Apple M1", "Apple M1 7-core", "Gray", "USA", "Apple MacBook Air", 8, 256, 13.3, 49.9, 2022, "macOS");

        Laptop laptop6 = new Laptop("Fujitsu", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "Japan", "Fujitsu LIFEBOOK E5412", 32, 4096, 14, 60, 2021, "Windows 11");
        Laptop laptop7 = new Laptop("Apple", "Apple M1", "Apple M1 7-core", "Gray", "USA", "Apple MacBook Air", 8, 256, 13.3, 49.9, 2022, "macOS");
        Laptop laptop8 = new Laptop("DEXP", "Intel Celeron N4020", "Intel UHD Graphics 600", "Silver", "China", "DEXP Aquilon",8 , 128, 14.1, 37, 2022, "Windows 11 Pro");
        Laptop laptop9 = new Laptop("GIGABYTE", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "China", "GIGABYTE G5 MF", 16, 512,  15.6, 54, 2023);
        Laptop laptop10 = new Laptop("ASUS", "Intel Core i5-1235U", "Intel Iris Xe Graphics", "Blue", "China", "ASUS Vivobook X1704ZA-AU123", 16, 512, 17, 50, 2023, "Windows 10");

        HashSet<Laptop> laptops = new HashSet<Laptop>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9, laptop10));
        Scanner choiceSc = new Scanner(System.in);
        Scanner findUse = new Scanner(System.in);
        Scanner choiseScTwo = new Scanner(System.in);
        boolean choiceError = true;
        int countFind = 0;
        while (choiceError) {
            System.out.println("По какому критерию хотите производить поиск? \n1 - Фирма\n2 - Процессор\n3 - Видеокарта\n4 - Цвет\n5 - Страна изготовления\n6 - Модель ноутбука\n7 - ОЗУ\n8 - Размер жесткого диска\n9 - Диагональ экрана\n10 Емкость аккамулятора\n11 - Год изготовления\n12 - Операционная система");
            int choice = choiceSc.nextInt();
            switch (choice) {
                case 1:
                    System.err.println("Введите название фирмы ноутбука:");
                    String find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getFirm().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            System.out.println(laptop);
                            System.out.println();
                            countFind++;
                        }
                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
                case 2:
                    System.err.println("Введите название процессора:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getCPU().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            System.out.println(laptop);
                            System.out.println();
                            countFind++;
                        }
                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
                case 3:
                    System.err.println("Введите название видеокарты:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getVideoCard().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            System.out.println(laptop);
                            System.out.println();
                            countFind++;
                        }
                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
                case 4:
                    System.err.println("Введите желаемый цвет ноутбука:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getColor().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            System.out.println(laptop);
                            System.out.println();
                            countFind++;
                        }
                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
                case 5:
                    System.err.println("Введите страну изготовления ноутбука:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getCountryOfManufacture().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            System.out.println(laptop);
                            System.out.println();
                            countFind++;
                        }
                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
                case 6:
                    System.err.println("Введите модель ноутбука:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getModel().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            System.out.println(laptop);
                            System.out.println();
                            countFind++;
                        }
                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
                // интовые значения
                case 7:
                    System.err.println("Введите колличество оперативной памяти:");
                    int findNum = findUse.nextInt();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большей оперативной памятью, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшей оперативной памятью, введите любое другое значение.");
                    String choiceFind = choiseScTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getRAM() >= findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getRAM() <= findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    }
                    choiceError = false;
                    System.out.println("Найдено резултатов - " + countFind);
                    break;
                case 8:
                    System.err.println("Введите размер жесткого диска:");
                    findNum = findUse.nextInt();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большим размером жесткого диска, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшим размером жесткого диска, введите любое другое значение.");
                    choiceFind = choiseScTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getHardDrive() >= findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getHardDrive() <= findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    }
                    choiceError = false;
                    System.out.println("Найдено резултатов - " + countFind);
                    break;
                case 9:
                    System.err.println("Введите диагональ:");
                    double findDouble = findUse.nextDouble();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большим размером диагонали, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшим размером диагонали, введите любое другое значение.");
                    choiceFind = choiseScTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getScreenDiagonal() >= findDouble) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getScreenDiagonal() <= findDouble) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    }
                    choiceError = false;
                    System.out.println("Найдено резултатов - " + countFind);
                    break;
                case 10:
                    System.err.println("Введите емкость аккамулятора:");
                    findDouble = findUse.nextDouble();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большей емкостью аккамулятора, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшей емкостью аккамулятора, введите любое другое значение.");
                    choiceFind = choiseScTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getBattery() >= findDouble) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getBattery() <= findDouble) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    }
                    choiceError = false;
                    System.out.println("Найдено резултатов - " + countFind);
                    break;
                case 11:
                    System.err.println("Введите год изготовления:");
                    findNum = findUse.nextInt();
                    System.out.println();
                    System.out.println("Чтобы показать более новые модели, введите 1.");
                    System.out.println("Чтобы показать более старые модели, введите 2");
                    System.out.println("Чтобы показать модели только необходимового вам года, введите любое другое значение");
                    choiceFind = choiseScTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getYearOfManufacture() >= findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    } else if (choiceFind.equals("2")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getYearOfManufacture() <= findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getYearOfManufacture() == findNum) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }
                    }
                    choiceError = false;
                    System.out.println("Найдено резултатов - " + countFind);
                    break;
                case 12:
                    System.err.println("Введите название операционной системы:");
                    System.out.println("(Чтобы произвести поиск всех ноутбуков без установленной операционной системой, введите null)");
                    System.out.println("(Чтобы произвести поиск всех ноутбуков с установленной операционной системой, введите all)");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getOperatingSystem().toLowerCase();
                        boolean differend = false;
                        if (find.equals("all")) {
                            if (!getFind.equals("не установлена")) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        } else if (find.equals("null")) {
                            if (getFind.equals("не установлена")) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        } else {
                            if (find.length() > getFind.length()) {
                                differend = true;
                            } else {
                                for (int i = 0; i < find.length(); i++) {
                                    if (find.charAt(i) != getFind.charAt(i)) {
                                        differend = true;
                                        i = find.length();
                                    }
                                }
                            }
                            if (!differend) {
                                System.out.println(laptop);
                                System.out.println();
                                countFind++;
                            }
                        }

                    }
                    System.out.println("Найдено резултатов - " + countFind);
                    choiceError = false;
                    break;
            
                default:
                    System.out.println("Ошибка! Пожалуйста выберите один из указанных критериев поиска!\n\n");
                    break;
        }
        }
        choiseScTwo.close();
        choiceSc.close();
        findUse.close();
    }
}
