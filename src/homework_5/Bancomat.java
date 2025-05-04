package homework_5;

public class Bancomat {
    int twenty;
    int fifty;
    int one_hundred;

    public void addtwenty(int twenty) {
        this.twenty += twenty;
    }

    public void addfifty(int fifty) {
        this.fifty += fifty;
    }

    public void addone_hundred(int one_hundred) {
        this.one_hundred += one_hundred;
    }

    public void withdraw_money(int Sum) {
        int cntT = 0;
        int cntF = 0;
        int cntO = 0;
        if (Sum > twenty * 20 + fifty * 50 + one_hundred * 100) {
            System.out.println("Недостаточно средств");
        } else {
            while (Sum >= 100 && one_hundred >= 1) {
                cntO += 1;
                Sum -= 100;
                one_hundred = one_hundred - 1;
            }
            while (Sum >= 50 && fifty >= 1) {
                cntF += 1;
                Sum -= 50;
                fifty = fifty - 1;
            }
            while (Sum >= 20 && twenty >= 1) {
                cntT += 1;
                Sum -= 20;
                twenty = twenty - 1;
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
        bancomat.addfifty(5);
        bancomat.addone_hundred(5);
        bancomat.addtwenty(5);
        bancomat.withdraw_money(420);
        System.out.println();
        bancomat.withdraw_money(200);
        System.out.println();
        bancomat.withdraw_money(5190);
        System.out.println();
        bancomat.withdraw_money(211);
    }
}
