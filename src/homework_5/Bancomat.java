package homework_5;

import java.util.Arrays;

public class Bancomat {
    int twenty;
    int fifty;
    int one_hundred;

    public void Addtwenty(int twenty) {
        this.twenty += twenty;
    }

    public void Addfifty(int fifty) {
        this.fifty += fifty;
    }

    public void Addone_hundred(int one_hundred) {
        this.one_hundred += one_hundred;
    }

    public void Withdraw_money(int Sum) {
        int cntT = 0;
        int cntF = 0;
        int cntO = 0;
        if (Sum > twenty * 20 + fifty * 50 + one_hundred * 100) {
            System.out.println("Недостаточно средств");
        } else {
            while (Sum >= 100) {
                cntO += 1;
                Sum -= 100;
            }
            while (Sum >= 50) {
                cntF += 1;
                Sum -= 50;
            }
            while (Sum >= 20) {
                cntT += 1;
                Sum -= 20;
            }
            if (Sum != 0) {
                System.out.println("Операция не произойдет, не удается выдать остаток " + Sum);
            } else {
                System.out.println("К выдаче " + cntO + " Купюр по 100");
                System.out.println(cntF + " Купюр по 50");
                System.out.println(cntT + " Купюр по 20");
            }
        }
    }

    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat();
        bancomat.Addfifty(3);
        bancomat.Addone_hundred(4);
        bancomat.Addtwenty(4);
        bancomat.Withdraw_money(421);
        System.out.println();
        bancomat.Withdraw_money(190);
        System.out.println();
        bancomat.Withdraw_money(5190);
    }
}
