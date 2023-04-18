package Homework1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.*;

public class Main {
    private FamilyTree familyTree = new FamilyTree();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Дата рождения в формате (дд/мм/гггг): ");
        String dateString = scanner.nextLine();
        Date birthDate;
        try {
            birthDate = new SimpleDateFormat("дд/мм/гггг").parse(dateString);
        } catch (ParseException e) {
            System.out.println("Неверный формат");
            return;
        }
        System.out.print("Пол: ");
        String gender = scanner.nextLine();
        Person person = new Person(name, birthDate, gender);
        try {
            FileWriter writer = new FileWriter("persons.txt", true);
            String personInfo = person.getName() + "," + person.getBirthDate() + "," + person.getGender() + "n";
            writer.write(personInfo);
            writer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }
}
