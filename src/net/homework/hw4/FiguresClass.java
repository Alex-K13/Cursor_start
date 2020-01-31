package net.homework.hw4;

import net.homework.hw4.shapes.plane.Circle;
import net.homework.hw4.shapes.plane.Rectangle;
import net.homework.hw4.shapes.plane.Triangle;
import net.homework.hw4.shapes.space.Cuboid;
import net.homework.hw4.shapes.space.Sphere;
import net.homework.hw4.shapes.space.SquarePyramid;
import net.homework.hw4.abstracts.Shape;

public class FiguresClass {
    public void showInfo() {
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
        new FiguresClass().showInfo();
    }
}