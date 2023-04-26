package Homework5.SchoolManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Pupil> pupils = new HashMap<>();

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить ученика");
            System.out.println("2. Просмотреть список учеников");
            System.out.println("3. Найти ученика");
            System.out.println("4. Удалить ученика");
            System.out.println("5. Выйти");
            int choice = scanner.nextInt();
            scanner.nextLine(); // считываем символ новой строки после ввода числа
            switch (choice) {
                case 1:
                    addPupil();
                    break;
                case 2:
                    viewPupils();
                    break;
                case 3:
                    findPupil();
                    break;
                case 4:
                    deletePupil();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
        System.out.println("До свидания!");
    }

    private static void addPupil() {
        System.out.print("Введите имя ученика: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст ученика: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Введите класс ученика: ");
        int grade = scanner.nextInt();
        scanner.nextLine();
        Pupil pupil = new Pupil(name, age, grade);
        pupils.put(name, pupil);
        System.out.println("Ученик успешно добавлен.");
    }

    private static void viewPupils() {
        if (pupils.isEmpty()) {
            System.out.println("Список учеников пуст.");
        } else {
            for (Map.Entry<String, Pupil> entry : pupils.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    private static void findPupil() {
        System.out.print("Введите имя ученика: ");
        String name = scanner.nextLine();
        Pupil pupil = pupils.get(name);
        if (pupil != null) {
            System.out.println(pupil);
        } else {
            System.out.println("Ученик с именем " + name + " не найден.");
        }
    }

    private static void deletePupil() {
        System.out.print("Введите имя ученика: ");
        String name = scanner.nextLine();
        Pupil pupil = pupils.remove(name);
        if (pupil != null) {
            System.out.println("Ученик " + name + " удален.");
        } else {
            System.out.println("Ученик с именем " + name + " не найден.");
        }
    }

}
