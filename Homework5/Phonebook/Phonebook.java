package Homework5.Phonebook;
import java.io.*;
import java.util.*;
public class Phonebook {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, String> phonebook = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в телефонный справочник!");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Найти контакт");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Показать все контакты");
            System.out.println("5. Экспортировать контакты");
            System.out.println("6. Импортировать контакты");
            System.out.println("7. Выйти из программы");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContacts();
                    break;
                case 5:
                    exportContacts();
                    break;
                case 6:
                    importContacts();
                    break;
                case 7:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.print("Введите номер телефона: ");
        String phone = scanner.next();
        phonebook.put(name, phone);
        System.out.println("Контакт добавлен: " + name + " - " + phone);
    }

    private static void findContact() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.next();
        String phone = phonebook.get(name);
        if (phone != null) {
            System.out.println("Номер телефона: " + phone);
        } else {
            System.out.println("Контакт не найден!");
        }
    }

    private static void deleteContact() {
        System.out.print("Введите имя контакта: ");
        String name = scanner.next();
        String phone = phonebook.remove(name);
        if (phone != null) {
            System.out.println("Контакт удален: " + name + " - " + phone);
        } else {
            System.out.println("Контакт не найден!");
        }
    }

    private static void showContacts() {
        if (phonebook.isEmpty()) {
            System.out.println("Справочник пуст!");
        } else {
            for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    private static void exportContacts() {
        System.out.print("Введите имя файла для экспорта: ");
        String fileName = scanner.next();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                writer.println(entry.getKey() + "," + entry.getValue());
            }
            System.out.println("Контакты экспортированы в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при экспорте контактов: " + e.getMessage());
        }
    }
    private static void importContacts() {
        System.out.print("Введите имя файла для импорта: ");
        String fileName = scanner.next();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] contact = line.split(",");
                if (contact.length == 2) {
                    phonebook.put(contact[0], contact[1]);
                }
            }
            System.out.println("Контакты импортированы из файла: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } 
    }

}
