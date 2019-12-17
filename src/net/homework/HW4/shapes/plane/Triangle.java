package net.homework.HW4.PlaneShape;

import net.homework.HW4.abstracts.PlaneShape;
import net.homework.HW4.interfaces.AreaMeasurable;
import net.homework.HW4.interfaces.PerimeterMeasurable;

import java.awt.geom.Point2D;
import java.util.HashMap;

public class Triangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {
    private HashMap<String, Double> point = new HashMap<>();

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.point.put("x1", x1);
        this.point.put("y1", y1);
        this.point.put("x2", x2);
        this.point.put("y2", y2);
        this.point.put("x3", x3);
        this.point.put("y3", y3);

        firstSide = Point2D.distance(x1, y1, x2, y2);
        secondSide = Point2D.distance(x2, y2, x3, y3);
        thirdSide = Point2D.distance(x3, y3, x1, y1);

        halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        area = Math.round(area);
    }

    @Override
    public double countArea() {
        return Math.round(area);
    }

    @Override
    public double countPerimeter() {
        return Math.round(firstSide + secondSide + thirdSide);
    }

    @Override
    public String toString() {

        return "Triangle: area - " + countArea() + " cm\u00B2; " + "perimeter - " + countPerimeter() + " cm; " + "point coordinates - " +
                point + "; " + "first side - " + Math.round(firstSide) + " cm; " + "second side - " +
                Math.round(secondSide) + " cm; " + "third side - " + Math.round(thirdSide) + " cm;";
    }
}