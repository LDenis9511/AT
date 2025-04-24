package homework_3;

import java.util.Random;
import java.util.Scanner;

public class homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  размер массива: ");
        int a = scanner.nextInt();
        System.out.println("Все элементы в прямом порядке:");
        int[] m = new int[a];
        for (int i = 0; i < a; i++) {
            m[i] = new Random().nextInt(100) + 1;
            System.out.println(m[i]);
        }
        System.out.println("Все элементы в обратном порядке:");
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.println(m[i]);
        }
    }
}
