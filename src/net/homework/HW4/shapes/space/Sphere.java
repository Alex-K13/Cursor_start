package net.homework.HW4.SpaceShape;

import net.homework.HW4.abstracts.SpaceShape;
import net.homework.HW4.interfaces.AreaMeasurable;
import net.homework.HW4.interfaces.VolumeMeasurable;

import java.util.HashMap;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    HashMap<String, Double> point = new HashMap<>();

    public Sphere(double x1, double y1, double radius) {
        this.point.put("x1", x1);
        this.point.put("y1", y1);
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.round(4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double countVolume() {
        return Math.round(4 * Math.PI * Math.pow(radius, 3) / 3);
    }

    @Override
    public String toString() {
        return "Sphere: area - " + countArea() + " cm\u00B2; " + "volume - " + countVolume() + " cm\u00B3; " + "point coordinates - " +
                point + "; " + "radius - " + radius + " cm;";
    }
}