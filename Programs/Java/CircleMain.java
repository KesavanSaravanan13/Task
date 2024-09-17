import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void clacArea() {
        double result = 3.14 * this.getRadius() * this.getRadius();
        System.out.println("The Area of the Circle: " + result);
    }

    public void clacCircumference() {
        double result = 3.14 * 2 * this.getRadius();
        System.out.println("The Circumference of the Circle: " + result);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius : ");
        Circle c = new Circle(sc.nextDouble());
        c.clacArea();
        c.clacCircumference();
    }
}
