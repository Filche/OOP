package company.Automobile;

public class PassengerCar extends Car{

    private final int passengers;
    private static final double MAX_SPEED = 240;

    public PassengerCar(String name, Engine engine, float weight, int passengers){
        super(name,engine,weight);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public void speedBoost(int boost){
        if(this.speed + boost >= MIN_SPEED && this.speed + boost <= MAX_SPEED && this.engine.isRight() && this.engine.isWorking()) {
            this.speed += boost;
        }
        else if(!this.engine.isWorking()) {
            System.out.println("\nEngine is not working!");
        }
        else {
            System.out.println("\nEngine is broken!");
            this.engine.setRight(false);
            this.engine.setWorking(false);
            this.speed = 0;
        }
    }

    @Override
    public void beginningOfDriving() {
        if(this.engine.isRight()){
            this.engine.setWorking(true);
            this.speed = 60;
        }
        else
        {
            System.out.println("\nEngine is not right! You must repair it!");
        }
    }

    @Override
    public String toString() {
        return "\nName: " + this.name +
                ", Weight: " + this.weight +
                ", Passengers: " + this.passengers +
                ", Current Speed: " + this.speed +
                "\nEngine: " + this.engine.toString();
    }
}