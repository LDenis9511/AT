package homework_3;

import java.util.Random;
import java.util.Scanner;

public class homework3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  размер массива: ");
        int a = scanner.nextInt();
        int[] m = new int[a];
        for (int i = 0; i < a; i++) {
            m[i] = new Random().nextInt(100) + 1;
        }
        for (int i = 1; i < m.length; i++) {
            if (m[i] < m[i - 1]) {
                System.out.println("Массив не с возрастающей последовательностью");
                return;
            }
        }
        System.out.println("Массив  с возрастающей последовательностью");
    }
}
