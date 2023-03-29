package Interface;

public class Main {
    public static void main(String[] args) {
        Car car0 = new Car();
        // You can create tyope of variable as type of interface
        Engine car1 = new Car();
        // car.a;
        car1.acc();
        // interface does not care whether two classes are related or not
        // in normal inheritance it cares whether two classes are inherited
        // car.brake();
        car0.acc();
        car0.start();
        car0.stop();

        Media carMedia = new Car();
        carMedia.stop();

        NiceCar car = new NiceCar();
        car.startMusic();
        car.start();
        car.upgradeEngine();
        car.start();

    }

}
