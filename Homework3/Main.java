package Homework3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Research research = new Research();
        // запрос у пользователя информации о человеке и какие родственные связи у него
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные нового человека:");
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Пол: ");
        String gender = scanner.nextLine();
        System.out.print("Дата рождения: ");
        String birthDate = scanner.nextLine();
        System.out.print("Родственные связи (отец, мать, сын, дочь): ");
        String relationships = scanner.nextLine();

        Person person = new Person(name, gender, birthDate);
        research.addPerson(person);

        // добавление в файл
        try {
            FileWriter writer = new FileWriter("persons.txt", true);
            writer.write(person.toString() + "," + relationships + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        scanner.close();
       }
}