package homework_9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую");
        System.out.println("Пример 1,1,2,3,4,4,5,5,5,5,3,1,2,2");
        String numbers = scanner.nextLine();
        String[] number = numbers.split(",");
        Set<String> number1 = new HashSet<>();
        for (int i = 0; i < number.length; i++) {
            number1.add(number[i]);
        }
        System.out.println("Введенные значения без повторений");
        System.out.println(number1);
    }
}
