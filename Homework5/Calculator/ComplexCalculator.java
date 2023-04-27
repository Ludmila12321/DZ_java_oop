package Homework5.Calculator;
import Calculator.ComplexNumber.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ComplexCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(ComplexCalculator.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("calculator.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка при создании файла лога", e);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выйти из программы");

            int choice = scanner.nextInt();
            logger.log(Level.INFO, "Выбрано действие {0}", choice);
            if (choice == 5) {
                System.out.println("До свидания!");
                logger.log(Level.INFO, "Программа завершена");
                break;
            }

            ComplexNumber number1 = getComplexNumber("Введите первое число:");
            ComplexNumber number2 = getComplexNumber("Введите второе число:");

            ComplexNumber result = null;

            switch (choice) {
                case 1:
                    result = number1.add(number2);
                    break;
                case 2:
                    result = number1.subtract(number2);
                    break;
                case 3:
                    result = number1.multiply(number2);
                    break;
                case 4:
                    result = number1.divide(number2);
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    logger.log(Level.WARNING, "Неверный выбор действия {0}", choice);
                    break;
            }

            if (result != null) {
                System.out.println("Результат: " + result);
                logger.log(Level.INFO, "Результат: {0}", result);
            }
        }
    }

    private static ComplexNumber getComplexNumber(String message) {
        System.out.println(message);
        System.out.print("Введите действительную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
}
