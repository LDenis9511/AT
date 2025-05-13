package homework_6_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        circle.setRadius(5);
        circle1.setRadius(12);
        triangle.setDlinaosnovania(20);
        triangle.setDlinastoroni1(10);
        triangle.setDlinastoroni2(5);
        triangle.setVisota(4);
        rectangle.setDlinastoroni1(10);
        rectangle.setDlinastoroni2(33);
        rectangle1.setDlinastoroni1(22);
        rectangle1.setDlinastoroni2(55);
        circle.perimeterculation();
        circle1.perimeterculation();
        triangle.perimeterculation();
        rectangle.perimeterculation();
        rectangle1.perimeterculation();
        System.out.println("Сумма периметра = " + (circle.getPerimeter()+circle1.getPerimeter()+triangle.getPerimeter()+rectangle1.getPerimeter()+rectangle.getPerimeter()));


    }
}
