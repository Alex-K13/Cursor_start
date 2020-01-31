package net.homework.hw4.shapes.space;

import net.homework.hw4.abstracts.SpaceShape;
import net.homework.hw4.interfaces.AreaMeasurable;
import net.homework.hw4.interfaces.VolumeMeasurable;

import javax.swing.*;
import java.util.HashMap;

public class Cuboid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    HashMap<String, Double> point = new HashMap<>();

    public Cuboid(double x1, double y1, double width, double height, double depth) {
        this.point.put("x1", x1);
        this.point.put("y1", y1);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double calculationArea() {
        return Math.round(2 * (width * height + height * depth + width * depth));
    }

    @Override
    public double calculationVolume() {
        return Math.round(width * height * height);
    }

    @Override
    public String toString() {
        return "Cuboid: area - " + calculationArea() + " cm\u00B2; " + "volume - " + calculationVolume() + " cm\u00B3; " + "point coordinates - " +
                point + "; " + "width - " + width + " cm; " + "height - " + height + " cm; " + "depth - " + depth +
                " cm;";
    }
}