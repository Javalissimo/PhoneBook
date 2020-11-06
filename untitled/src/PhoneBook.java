import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    static int bookScore = 0;
    private static String phoneNumber;

    public static void main(String[] args) {
        //Добавить считывание ввода пользователя в цикле
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Введите имя в формате ФИО");
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }



        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            System.out.println("Введите нормер телефона");
            String phoneNumber = scanner.nextLine();
            isCorrectNumber = checkPhoneNumber(phoneNumber);
            if (!isCorrectNumber) System.out.println("Введите корректный номер!");
        }

    }
    public static boolean checkPhoneNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }


    public static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;

    }

    public static String formatName(String name) {
        return "";
    }

    public static String formatPhoneNumber(String number) {
        return "";
    }

    public static void add(String[][] book, String name, String number) {
        //add logic
        book[bookScore][0] = name;
        book[bookScore][1] = number;
        bookScore++;
    }

    public static void list(String[][] book) {
        //print phone book
        String str =  "";
        for (String[] strings : book) {
            for (String string : strings) {
                System.out.println(string);
            }

        }

    }
}
