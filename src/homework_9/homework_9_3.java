package homework_9;

/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class homework_9_3 {
    public static void main(String[] args) {
        String[] mass = {"a", "b", "a", "c", "b"};
        String[] mass2 = {"c", "b", "a"};
        String[] mass3 = {"c", "c", "c", "c"};

        xzkaknazvat(mass);
        xzkaknazvat(mass2);
        xzkaknazvat(mass3);
    }


    public static void xzkaknazvat(String[] mass) {
        Map<String, Boolean> res = new HashMap<>();
        for (int i = 0; i < mass.length; i++) {
            if (res.containsKey(mass[i])) {
                res.put(mass[i], true);
            } else {
                res.put(mass[i], false);
            }
        }
        System.out.println("wordMultiple " + Arrays.toString(mass) + " -> " + res);

    }

}
