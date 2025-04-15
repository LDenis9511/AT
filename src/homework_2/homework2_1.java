package homework_2;

import java.util.Scanner;

public class homework2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else
            System.out.println("Число нечетное");
        scanner.close();
    }
}
