package net.homework.hw4.shapes.space;

import net.homework.hw4.abstracts.SpaceShape;
import net.homework.hw4.interfaces.AreaMeasurable;
import net.homework.hw4.interfaces.VolumeMeasurable;

import java.util.HashMap;

import static java.lang.Math.sqrt;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    HashMap<String, Double> point = new HashMap<>();

    public SquarePyramid(double x1, double y1, double width, double height) {
        this.point.put("x1", x1);
        this.point.put("y1", y1);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculationArea() {
        return Math.round(2 * width * (width / (2 + sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2)))));
    }

    @Override
    public double calculationVolume() {

        return Math.round((Math.pow(width, 2) * height) / 3);
    }

    @Override
    public String toString() {
        return "SquarePyramid: area - " + calculationArea() + " cm\u00B2; " + "volume - " + calculationVolume() + " cm\u00B3; " + "point coordinates - " +
                point + "; " + "width - " + width + " cm; " + "height - " + height + " cm; ";
    }
}
