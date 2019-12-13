package net.homework.HW4.abstracts;

import net.homework.HW4.interfaces.AreaMeasurable;
import net.homework.HW4.interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double halfPerimeter;
    protected double area;
    protected double width;
    protected double height;
    protected double radius;
}
