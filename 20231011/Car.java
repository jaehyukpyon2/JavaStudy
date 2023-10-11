public class Car {

    private String model;
    private int speed;

    public Car(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        this.setSpeed(100);
        System.out.println(this.model + "이(가) 달립니다. (시속: " + this.speed + " km/h)");
    }
}
