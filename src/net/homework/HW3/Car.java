package net.homework.HW3;

public class Car {
    private int speed;

    public void startEngine(boolean engine) {
        if (engine) {
            System.out.println("Engine On");
            Car.move();
            speed = 70;
        } else {
            System.out.println("Turn on the engine");
            System.out.println("Car dont move");
        }
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public void stopEngine() {
        System.out.println("Engine Off");
    }

    static void move() {
        System.out.println("Car move");
    }


    public void cruise(int cruiseSpeed) {
        if (speed > 60) {
            System.out.println("Cruise speed is " + cruiseSpeed + " km/h");
        } else {
            System.out.println("Cruise control is off");
        }
    }
}