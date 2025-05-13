package homework_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_7_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        first(0);
        second();
        third();
        fourth();
    }

    public static void first(int a) {
        try {
            System.out.println("10/" + a + " = " + 10 / a);
        } catch (ArithmeticException e) {
            System.out.println("На 0 не делим");
        }
    }

    public static void second() {
        try {
            System.out.println("Введите число, на которое будем делить 10");
            int a = scanner.nextInt();
            System.out.println("10/" + a + " = " + 10 / a);
        } catch (ArithmeticException e) {
            System.out.println("На 0 не делим");
        } catch (InputMismatchException e) {
            System.out.println("Фигня а не чило");
        }
    }

    public static void third() {
        try {
            System.out.println("Введите число, на которое будем делить 10");
            int a = scanner.nextInt();
            System.out.println("10/" + a + " = " + 10 / a);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("ОШИБКА!!!!!!!!!!!!!");
        }
    }

    public static void fourth() {
        try {
            System.out.println("Введите число, на которое будем делить 10");
            int b = scanner.nextInt();
            System.out.println("10/" + b + " = " + 10 / b);
        } catch (ArithmeticException e) {
            System.out.println("На 0 не делим");
        } catch (InputMismatchException e) {
            System.out.println("Фигня а не чило");
        } finally {
            System.out.println("Конец...");
        }
    }
}
