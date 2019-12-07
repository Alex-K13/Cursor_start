package net.homework.HW3;

public class Circle {

    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(6);

        System.out.println(circle.calculateArea());
    }

    private double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}