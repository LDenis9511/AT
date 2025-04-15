package homework_2;

import java.util.Scanner;

public class homework2_5 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        double a = scanner.nextDouble();
        if (a % 1 != 0) {
            System.out.println("Вы ввели не целое число");
            return;
        }
        if (a < 0) {
            System.out.println("Вы ввели не положительное число");
            return;
        }
        for (int i = 1; i < a; i++) {
            sum = sum + i;
        }

        System.out.println("Сумма чисел от 1 до " + String.format("%.0f", a) + " = " + sum);
    }
}
