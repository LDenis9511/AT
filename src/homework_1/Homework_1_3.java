package homework_1;

import java.util.Arrays;

public class Homework_1_3 {
    public static void main(String[] args) {

        int n = 123;
        int first = n / 100;
        n = n - first*100;
        int second = n / 10;
        int last = n % 10;
        int y = first+second+last;
        System.out.println("Ответ = " + y);

    }

}
