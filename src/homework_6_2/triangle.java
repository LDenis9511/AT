package homework_6_2;

public class triangle extends figure {
    private double perimeter;
    private double areacal;
    private double visota;
    private double dlinaosnovania;
    private double dlinastoroni1;
    private double dlinastoroni2;

    @Override
    public void areacalculation() {
        if (dlinaosnovania <= 0) {
            System.out.println("Длинна основания не указана");
        } else if (visota <= 0) {
            System.out.println("Высота не указана");
        } else
            this.areacal = 0.5 * visota * dlinaosnovania;
    }

    @Override
    public void perimeterculation() {
        if (dlinaosnovania <= 0) {
            System.out.println("Длинна основания не указана");
        } else if (dlinastoroni1 <= 0) {
            System.out.println("Длинна стороны 1 не указана");
        } else if (dlinastoroni2 <= 0) {
            System.out.println("Длинна стороны 2 не указана");
        } else
            this.perimeter = dlinaosnovania + dlinastoroni1 + dlinastoroni2;
    }

    public void setVisota(double visota) {
        this.visota = visota;
    }

    public void setDlinaosnovania(double dlinaosnovania) {
        this.dlinaosnovania = dlinaosnovania;
    }

    public void setDlinastoroni1(double dlinastoroni1) {
        this.dlinastoroni1 = dlinastoroni1;
    }

    public void setDlinastoroni2(double dlinastoroni2) {
        this.dlinastoroni2 = dlinastoroni2;
    }

    public double getAreacal() {
        if (areacal == 0) {
            System.out.println("Площадь не была расчитана");
        }
        return areacal;
    }

    public double getPerimeter() {
        if (perimeter == 0) {
            System.out.println("Периметр не был расчитан");
        }
        return perimeter;
    }
}
