public class Vehicle {

    private int numberOfWheels;
    private int maxOccupancy;
    private double velocity;
    private PowerType powerType;

    public Vehicle(int numberOfWheels, int maxOccupancy, double velocity, PowerType powerType){
        this.numberOfWheels = numberOfWheels;
        this.maxOccupancy = maxOccupancy;
        this.velocity = velocity;
        this.powerType = powerType;
    }


    public double accelerate(){
        velocity += 15;
        return velocity;
    }

    public double decelerate(){
        velocity -= 15;
        return velocity;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // numberOfWheels doesn't need a setter as the number of wheels on the vehicle won't change

    public int getMaxOccupancy(){
        return maxOccupancy;
    }

    // maximumOccupancy doesn't need a setter as the specified max. occupancy in the vehicle won't change

    public double getVelocity(){
        return velocity;
    }

    public void setVelocity(double velocity){
        this.velocity = velocity;
    }

    public PowerType getPowerType(){
        return powerType;
    }

    // powerType doesn't need a setter as what powers the vehicle won't change


}
