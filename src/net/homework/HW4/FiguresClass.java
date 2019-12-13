package net.homework.HW4;

import net.homework.HW4.PlaneShape.Circle;
import net.homework.HW4.PlaneShape.Rectangle;
import net.homework.HW4.PlaneShape.Triangle;
import net.homework.HW4.SpaceShape.Cuboid;
import net.homework.HW4.SpaceShape.Sphere;
import net.homework.HW4.SpaceShape.SquarePyramid;
import net.homework.HW4.abstracts.Shape;

public class FiguresClass {
    public void ShowInfo() {
        Shape[] shapes = new Shape[]{
                new Circle(2, 4, 10),
                new Rectangle(0, 1, 45, 6.5),
                new Triangle(9, 25, 8, 7, 18, 20),
                new SquarePyramid(7, 5, 15, 18),
                new Cuboid(4, 6, 11, 18, 25.1),
                new Sphere(13, 15, 29)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
    public static void main(String[] args) {
        new FiguresClass().ShowInfo();
    }
}