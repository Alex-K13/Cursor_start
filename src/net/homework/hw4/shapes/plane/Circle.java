package net.homework.hw4.shapes.plane;

import net.homework.hw4.abstracts.PlaneShape;
import net.homework.hw4.interfaces.AreaMeasurable;
import net.homework.hw4.interfaces.PerimeterMeasurable;

import java.util.HashMap;

public class Circle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    HashMap<String, Double> point = new HashMap<>();

    public Circle(double x1, double y1, double radius) {
        this.point.put("x1", x1);
        this.point.put("y1", y1);
        this.radius = radius;

        area = (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculationArea() {
        return Math.round(area);
    }

    @Override
    public double calculationPerimeter() {
        return Math.round(Math.PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle: area - " + calculationArea() + " cm\u00B2; " + "perimeter - " + calculationPerimeter() + " cm; " + "point coordinates - "
                + point + "; radius - " + radius + " cm; ";
    }
}
