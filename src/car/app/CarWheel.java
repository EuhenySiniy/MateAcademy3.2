package car.app;

public class CarWheel {
    private double wheelWear;

    public CarWheel() {
        this.wheelWear = 100;
    }

    public CarWheel(double wheelWear) {
        this.wheelWear = wheelWear;
    }

    public void wheelChange() {
        wheelWear = 100;
    }

    public void wipeWheel(double percent) {
        if (percent < 0) {
            System.out.println("The percentage can not be less than 0!");
        } else if (percent > 100) {
            System.out.println("Max percent is 100");
        } else {
            wheelWear = wheelWear - percent;
        }
    }

    public double getWheelWear() {
        return wheelWear;
    }

    public void info() {
        System.out.println("Wheel condition - " + getWheelWear());
    }
}
