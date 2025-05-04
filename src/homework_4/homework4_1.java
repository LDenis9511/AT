package homework_4;

import java.util.Scanner;

public class homework4_1 {
    public static void main(String[] args) {
        char[][] mass = {{'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты формата '12'");
        boolean win = false;
        int player = 0;
        while (true) {
            char hod = '-';
            if (player % 2 == 0) {
                hod = 'x';
            } else
                hod = '0';
            System.out.println("  0 1 2");
            pole(mass);
            System.out.println();
            System.out.println("Ход  " + hod);
            int a = scanner.nextInt();
            int b = a / 10;
            int c = a - b * 10;

            mass[b][c] = hod;
            int frend = 0;
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass.length; j++) {
                    if (mass[i][j] != '-') {
                        frend += 1;
                    }
                    if (frend == 9) {
                        System.out.println("Победила дружба");
                        pole(mass);
                        return;
                    }
                }
            }
            if (mass[0][0] == mass[1][1] && mass[0][0] == mass[2][2] && mass[0][0] != '-' ||
                    mass[0][2] == mass[1][1] && mass[0][2] == mass[2][0] && mass[0][2] != '-' ||
                    mass[0][0] == mass[1][0] && mass[0][0] == mass[2][0] && mass[0][0] != '-' ||
                    mass[2][0] == mass[2][1] && mass[2][0] == mass[2][2] && mass[2][0] != '-' ||
                    mass[1][0] == mass[1][1] && mass[1][0] == mass[1][2] && mass[1][0] != '-' ||
                    mass[0][0] == mass[0][1] && mass[0][0] == mass[0][2] && mass[0][0] != '-' ||
                    mass[0][2] == mass[1][2] && mass[0][2] == mass[2][2] && mass[0][2] != '-' ||
                    mass[0][1] == mass[1][1] && mass[0][1] == mass[2][1] && mass[0][1] != '-') {
                System.out.println("Победил " + hod);
                pole(mass);
                return;
            }
            player++;
        }
    }


    public static void pole(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }
}
