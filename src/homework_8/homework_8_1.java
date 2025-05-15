package homework_8;

import java.util.Scanner;


public class homework_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] main = new String[3];
        for (int i = 0; i < main.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            main[i] = scanner.nextLine();
        }
        homework_8_1(main);
        homework_8_2(main);
        homework_8_3(main);
        homework_8_4(main);
        System.out.println("Для задачи 5 ввпедите строку, которую задублим)");
        String dubl = scanner.nextLine();
        homework_8_5(dubl);
    }

    public static void homework_8_1(String[] a) {
        System.out.println("Задание 1:");
        String max = "";
        String min = "";
        for (int i = 0; i < a.length; ++i) {
            if (a[i].length() > max.length()) max = a[i];
            if (a[i].length() < min.length() || min.length() == 0) min = a[i];
        }
        System.out.println("Самая длинная строка  " + max + " Длинна " + max.length());
        System.out.println("Самая короткая строка  " + min + " Длинна " + min.length());
    }

    public static void homework_8_2(String[] a) {
        System.out.println("Задание 2:");
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j].length() > a[j + 1].length()) {
                    String tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " Длинна " + a[i].length());
        }
    }

    public static void homework_8_3(String[] a) {
        System.out.println("Задание 3:");
        int dlinna = 0;
        for (int i = 0; i < a.length; i++) {
            dlinna += a[i].length();
        }
        dlinna = dlinna / a.length;
        System.out.println("Средняя длинна " + dlinna);
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() < dlinna) {
                System.out.println("Строка, длина которых меньше средней " + a[i] + " Длинна " + a[i].length());
            }
        }
    }

    public static void homework_8_4(String[] a) {
        System.out.println("Задание 4:");
        int proverka = 0;
        for (int i = 0; i < a.length; i++) {
            int proverka2 = 0;
            for (int j = 0; j < a[i].length(); j++) {
                for (int k = j + 1; k < a[i].length(); k++) {
                    if (a[i].charAt(j) == a[i].charAt(k)) {
                        proverka2 += 1;
                    }
                }
            }
            if (proverka2 == 0) {
                proverka = 1;
            }
            if (proverka == 1) {
                System.out.println("Слово " + a[i] + " состоит из разных символов");
                return;
            }
        }
        System.out.println("Слов, состоящих из разных символов нет((((");
    }

    public static void homework_8_5(String a) {
        System.out.println("Задание 5:");
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < a.length(); i++) {
            sb.insert(i * 2, a.charAt(i));
        }
        System.out.println("a = " + sb);
    }
}
