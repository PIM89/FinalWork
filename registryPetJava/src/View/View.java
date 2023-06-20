package View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Чтобы завести новое животное выберите -> 1");
        System.out.println("Чтобы увидеть список команд, которое выполняет животное выберите -> 2");
        System.out.println("Чтобы обучить животное новой команде выберите -> 3");
        System.out.println("Чтобы завершить программу выберите -> 4");
    }

    public int setChooseMenu() {
        System.out.println("Выбор операции: ");
        return scanner.nextInt();
    }

    public static int setChooseTypePet() {
        System.out.println("Выберите род животного: \n" +
                "Верблюды - 1 \n" +
                "Кошки - 2 \n" +
                "Собаки - 3 \n" +
                "Ослы - 4 \n" +
                "Хомяки - 5 \n" +
                "Лошади - 6 \n");
        System.out.println("Ваш выбор: ");
        return scanner.nextInt();
    }

    public static int setChooseIdPet() {
        System.out.println("Введите id животного: ");
        return scanner.nextInt();
    }

    public String setComandString() {
        System.out.println("Введите новую команду: ");
        return scanner.next();
    }

    public String setName() {
        System.out.println("Введите имя животного: ");
        String name = scanner.next();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public LocalDate setBirtday() {
        System.out.println("Введите дату рождения (ДД.ММ.ГГГГ): ");
        String date = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateOfBirth = null;
        try {
            dateOfBirth = LocalDate.parse(date, formatter);
            return dateOfBirth;
        } catch (Exception e) {
            System.out.println("Введены некоректные данные или не соответствует формат ввода данных!\n" + "Попробуйте еще раз!");
            return setBirtday();
        }
    }

    public int setLifting() {
        System.out.println("Введите грузоподъемность животного (кг): ");
        return scanner.nextInt();
    }

    public void successfulOperation() {
        System.out.println("Операция прошла успешно!");
    }
}
