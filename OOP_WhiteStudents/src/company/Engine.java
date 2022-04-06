package company;

public class Engine {

    private String name;
    private int power;
    private int torque;
    private float fuelCost;
    private boolean isRight;

    public Engine(){}

    public Engine(String name, int power, int torque, float fuelCost, boolean isRight) {
        this.name = name;
        this.power = power;
        this.torque = torque;
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

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public float getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(float fuelCost) {
        this.fuelCost = fuelCost;
    }

    public void repair(){
        setRight(true);
        System.out.println("\nEngine is right!");
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                ", Power: " + this.power +
                ", Torque: " + this.torque +
                ", FuelCost: " + this.fuelCost +
                ", IsRight: " + this.isRight;
    }
}