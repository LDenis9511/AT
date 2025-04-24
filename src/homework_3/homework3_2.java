package homework_3;

import java.util.Random;
import java.util.Scanner;

public class homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  размер массива: ");
        int a = scanner.nextInt();
        int max = 0;
        int min = 0;
        int[] m = new int[a];
        for (int i = 0; i < a; i++) {
            m[i] = new Random().nextInt(100) + 1;
        }
        min = m[0];
        for (int i = 0; i < m.length; ++i) {
            if (m[i] > max) max = m[i];
            if (m[i] < min) min = m[i];
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
