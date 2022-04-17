package company.Automobile;

public class Engine {

    private String name;
    private int power;
    private float fuelCost;
    private boolean isRight;
    private boolean isWorking;

    public Engine(){
        this.isRight = true;
    }

    public Engine(String name, int power, float fuelCost, boolean isRight) {
        this.name = name;
        this.power = power;
        this.fuelCost = fuelCost;
        this.isRight = isRight;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(float fuelCost) {
        this.fuelCost = fuelCost;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void repair(){
        setRight(true);
        System.out.println("\nEngine is right!");
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                ", Power: " + this.power +
                ", FuelCost: " + this.fuelCost +
                ", IsRight: " + this.isRight +
                ", IsWorking: " + this.isWorking;
    }
}