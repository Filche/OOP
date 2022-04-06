package company;

public class Main {

    public static void main(String[] args){
        Engine engine = new Engine("2JZ", 400, 6000, 1.2f,true);
        PassengerCar car = new PassengerCar("Toyota", engine, 800, 4);
        System.out.println(car.toString());
        car.beginningOfDriving();
        System.out.println(car.toString());
        car.speedBoost(100);
        System.out.println(car.toString());
        car.stop();
        System.out.println(car.toString());
        car.speedBoost(300);
        System.out.println(car.toString());
        car.beginningOfDriving();
        System.out.println(car.toString());
        car.speedBoost(100);
        System.out.println(car.toString());
        engine.repair();
        System.out.println(car.toString());
        car.speedBoost(100);
        System.out.println(car.toString());
    }
}