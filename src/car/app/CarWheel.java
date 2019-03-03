package car.app;

public class CarWheel {
    private double wheelWear;

    public CarWheel() {
        this.wheelWear = 1;
    }

    public CarWheel(double wheelWear) {
        this.wheelWear = wheelWear;
    }

    public void wheelChange() {
        wheelWear = 1;
    }

    public void wipeWheel(double percent) {
        wheelWear = wheelWear - percent * 0.01;
    }

    public double getWheelWear() {
        return wheelWear;
    }

    public void info() {
        System.out.println("Wheel condition - " + getWheelWear());
    }
}
