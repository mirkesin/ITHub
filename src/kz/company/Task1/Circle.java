package kz.company.Task1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 0.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
