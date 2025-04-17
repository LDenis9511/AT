package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  размер массива: ");
        int a = scanner.nextInt();
        int[] m = new int[a];
        for (int i = 0; i < a; i++) {
            m[i] = new Random().nextInt(100) + 1;
        }
        System.out.println("ДО: " + Arrays.toString(m));
        for (int i = 0; i < m.length / 2; i++) {
            int x = m[i];
            m[i] = m[(m.length - 1) - i];
            m[(m.length - 1) - i] = x;
        }
        System.out.println("ПОСЛЕ: " + Arrays.toString(m));
    }
}
