package homework_6_2;

public class circle extends figure {
    private double perimeter;
    private double areacal;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void areacalculation() {
        if (radius <= 0) {
            System.out.println("Радиус не указан");
        } else
            this.areacal = 3.14 * (radius * radius);
    }

    @Override
    public void perimeterculation() {
        if (radius <= 0) {
            System.out.println("Радиус не указан");
        } else
            this.perimeter = 2 * 3.14 * radius;
    }

    public double getPerimeter() {
        if (perimeter == 0) {
            System.out.println("Периметр не был расчитан");
        }
        return perimeter;
    }

    public double getAreacal() {
        if (areacal == 0) {
            System.out.println("Площадь не была расчитана");
        }
        return areacal;
    }
}

