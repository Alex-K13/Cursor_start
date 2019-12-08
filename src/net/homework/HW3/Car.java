package net.homework.HW3;

public class Car {
    public static String engine;

    public void startEngine() {
        engine = "engineOn";
        System.out.println("Engine On");
    }

    public void stopEngine() {
        engine = "engineOff";
        System.out.println("Engine Off");
    }

    void move() {
        if (Car.engine.equals("engineOn")) {
            System.out.println("Car move");
        } else {
            System.out.println("Car cant move");
        }
    }

    public void cruise(int speed) {
        System.out.println("Cruise speed is " + speed + "km/h");
    }

}
