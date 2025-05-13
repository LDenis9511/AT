package homework_6_2;

public class Rectangle extends Figure {
    private double perimeter;
    private double areacal;
    private double dlinastoroni1;
    private double dlinastoroni2;

    @Override
    public void areacalculation() {
        if (dlinastoroni1 <= 0) {
            System.out.println("Длинна стороны 1 не указана");
        } else if (dlinastoroni2 <= 0) {
            System.out.println("Длинна стороны 2 не указана");
        }else
        this.areacal = dlinastoroni1 * dlinastoroni2;
    }

    @Override
    public void perimeterculation() {
        if (dlinastoroni1 <= 0) {
            System.out.println("Длинна стороны 1 не указана");
        } else if (dlinastoroni2 <= 0) {
            System.out.println("Длинна стороны 2 не указана");
        }else
        this.perimeter = (dlinastoroni1 + dlinastoroni2) * 2;
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
