package net.homework.HW4.abstracts;

import net.homework.HW4.interfaces.AreaMeasurable;
import net.homework.HW4.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    protected double width;
    protected double height;
    protected double depth;
    protected double radius;

}