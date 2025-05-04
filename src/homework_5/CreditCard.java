package homework_5;

public class CreditCard {
    long Creditnumber;
    int CreditSum;

    public CreditCard(long CreditNumber, int CreditSum) {
        this.Creditnumber = CreditNumber;
        this.CreditSum = CreditSum;
    }

    public void addsum(int Sum) {
        CreditSum += Sum;
    }

    public void subsum(int Sum) {
        CreditSum -= Sum;
    }

    public void balance() {
        System.out.println("Баланс счета  " + Creditnumber + " = " + CreditSum);
    }

    public static void main(String[] args) {
        CreditCard cart = new CreditCard(1, 1000);
        CreditCard cart2 = new CreditCard(2, 1000);
        CreditCard cart3 = new CreditCard(3, 1000);
        cart.addsum(500);
        cart2.addsum(1100);
        cart3.subsum(820);
        cart.balance();
        cart2.balance();
        cart3.balance();
    }
}
