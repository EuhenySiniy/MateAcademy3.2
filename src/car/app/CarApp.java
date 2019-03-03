package car.app;

public class CarApp {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.info();
        carDoor.openDoor();
        carDoor.info();
        CarWheel carWheel = new CarWheel();
        carWheel.info();
        carWheel.wipeWheel(25.7d);
        carWheel.info();
        carWheel.wheelChange();
        carWheel.info();

    }
}
