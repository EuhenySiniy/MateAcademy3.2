package car.app;

import java.util.ArrayList;

public class Car {
    private final int yearOfManufacture;
    private String typeMotor;
    private int maxSpeed;
    private double accelerationTo100;
    private int passengerCapacity;
    private int passenger;
    private int speed;
    private ArrayList<CarWheel> wheels;
    private ArrayList<CarDoor> doors;

    public Car(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car(int yearOfManufacture, String typeMotor, int maxSpeed, double accelerationTo100, int passengerCapacity, int passenger, int speed) {
        this.yearOfManufacture = yearOfManufacture;
        this.typeMotor = typeMotor;
        this.maxSpeed = maxSpeed;
        this.accelerationTo100 = accelerationTo100;
        this.passengerCapacity = passengerCapacity;
        this.passenger = passenger;
        this.speed = speed;
    }

    public void changeSpeed(int speed) {
        this.speed = speed;
    }

    public void newPassanger() {
        if (passenger <= passengerCapacity) {
            passenger++;
        } else {
            return;
        }
    }

    public void getOutPassanger() {
        if (passenger > 0) {
            passenger--;
        } else {
            return;
        }
    }

    public void getOutPassangers() {
        if (passenger > 0) {
            this.passenger = 0;
        } else {
            return;
        }
    }

    public CarDoor getDoor(int indx) {
        try {
            return doors.get(indx);
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public CarWheel getWheel(int indx) {
        try {
            return wheels.get(indx);
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public void removeTheWheels() {
        wheels.clear();
    }

    public void addTheWheel(int x) {
        for (int a = 0; a < x; a++) {
            wheels.add(new CarWheel());
        }
    }

    public double maxWornWheel() {
        double maxWornWheel = 1;
        for (int i = 0; i < wheels.size(); i++) {
            double wheel = wheels.get(i).getWheelWear();
            if (wheel < maxWornWheel) {
                maxWornWheel = wheel;
            }
        }
        return maxWornWheel;
    }

    public double whatIsTheMaxSpeed() {
        if (this.passenger == 0 || this.wheels.isEmpty()) {
            return 0;
        } else {
            int whatIsTheMaxSpeed = (int) (this.maxSpeed * maxWornWheel());
            return whatIsTheMaxSpeed;
        }
    }

    public void info() {
        System.out.println("Vehicle year - " + yearOfManufacture);
        System.out.println("Motor - " + typeMotor);
        System.out.println("Max speed - " + maxSpeed);
        System.out.println("o...100 km/h - " + accelerationTo100);
        System.out.println("Capacity - " + passengerCapacity + " person");
        System.out.println("Now in car - " + passenger + " person");
        System.out.println("Current speed - " + speed);
        System.out.println("Current max speed - " + whatIsTheMaxSpeed());

    }

}
