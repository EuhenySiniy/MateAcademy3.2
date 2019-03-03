package car.app;

public class CarDoor {
    private boolean isDoor;
    private boolean isWindow;

    public CarDoor() {
    }

    public CarDoor(boolean isDoor,
                   boolean isWindow) {
        this.isDoor = isDoor;
        this.isWindow = isWindow;
    }

    public boolean isDoor() {
        return isDoor;
    }

    public boolean isWindow() {
        return isWindow;
    }

    public void openDoor() {
        this.isDoor = true;
    }

    public void closeDoor() {
        this.isDoor = false;
    }

    public void closeOpenDoor() {
        this.isDoor = !this.isDoor;
    }

    public void openWindow() {
        this.isWindow = true;
    }

    public void closeWindow() {
        this.isWindow = false;
    }

    public void closeOpenWindow() {
        this.isWindow = !this.isWindow;
    }

    public final void info() {
        System.out.println("The door is " + (isDoor() ? "opened" : "close")
                + " and window is " + (isWindow() ? "opened" : "closed"));
    }
}
