public class Wind {

    private double speed;
    private double deg;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "src.main.Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}
