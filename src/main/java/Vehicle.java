public class Vehicle {

    private int numberOfWheels;
    private int maximumOccupancy;
    private double velocity;
    private String powerType;

    public Vehicle(int numberOfWheels, int maximumOccupancy, double velocity, String powerType){
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.velocity = velocity;
        this.powerType = powerType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // numberOfWheels doesn't need a setter as the number of wheels on the vehicle won't change

    public int getMaximumOccupancy(){
        return maximumOccupancy;
    }

    // maximumOccupancy doesn't need a setter as the specified max. occupancy in the vehicle won't change

    public double getVelocity(){
        return velocity;
    }

    public void setVelocity(double velocity){
        this.velocity = velocity;
    }

    public String getPowerType(){
        return powerType;
    }

    // powerType doesn't need a setter as what powers the vehicle won't change

    public double accelerate(double velocity){
        return velocity * 1.5;
    }

    public double brake(double velocity){
        return velocity / 1.5;
    }


}
