package company;

public abstract class Car {

    protected String name;
    protected Engine engine = new Engine();
    protected float weight;
    protected int speed;

    public Car() {}

    public Car(String name, Engine engine, float weight) {
        this.name = name;
        this.engine = engine;
        this.weight = weight;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void speedBoost(int boost);
    public abstract void beginningOfDriving();
    public void stop() {
        if(this.speed != 0)
            this.speed = 0;
        else
            System.out.println("Car is already stopped!");
    }
}