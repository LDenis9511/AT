package homework_3;

import java.util.Random;
import java.util.Scanner;

public class homework3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  размер массива: ");
        int a = scanner.nextInt();
        int[] m = new int[a];
        int x = 0;
        for (int i = 0; i < a; i++) {
            m[i] = new Random().nextInt(100);
        }
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 0) x++;
        }
        if (x > 0) {
            System.out.println("Количество нулевых элементов:" + x);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}
