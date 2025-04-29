package homework_5;

public class CreditCard {
    long Creditnumber;
    int CreditSum;

    public CreditCard(long CreditNumber) {
        this.Creditnumber = CreditNumber;
    }

    public void AddSum(int Sum) {
        CreditSum += Sum;
    }

    public void SubSum(int Sum) {
        CreditSum -= Sum;
    }

    public void Balance() {
        System.out.println("Баланс счета  " + Creditnumber + " = " + CreditSum);
    }

    public static void main(String[] args) {
        CreditCard cart = new CreditCard(1);
        CreditCard cart2 = new CreditCard(2);
        CreditCard cart3 = new CreditCard(3);
        cart.AddSum(500);
        cart2.AddSum(1100);
        cart3.SubSum(800);
        cart.Balance();
        cart2.Balance();
        cart3.Balance();
    }
}
