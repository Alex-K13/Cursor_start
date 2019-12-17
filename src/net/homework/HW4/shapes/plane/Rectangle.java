package net.homework.HW4.PlaneShape;

import net.homework.HW4.abstracts.PlaneShape;
import net.homework.HW4.interfaces.AreaMeasurable;
import net.homework.HW4.interfaces.PerimeterMeasurable;

import java.util.HashMap;

public class Rectangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    private HashMap<String, Double> point = new HashMap<>();


    public Rectangle(double x1, double y1, double width, double height) {
        this.point.put("x1", x1);
        this.point.put("y1", y1);
        this.width = width;
        this.height = height;

    }

    @Override

    public double countArea() {
        return Math.round(width * height);
    }

    @Override
    public double countPerimeter() {
        return Math.round(2 * (width + height));
    }

    @Override
    public String toString() {
        return "Rectangle: area - " + countArea() + " cm\u00B2; " + "perimeter - " + countPerimeter() + " cm; " + "point coordinates - "
                + point + "; width - " + width + " cm; " + "height - " + height + " cm;";
    }
}
