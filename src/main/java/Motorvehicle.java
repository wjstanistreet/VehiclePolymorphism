public class Motorvehicle extends Vehicle{

    private boolean publicTravel;

    public Motorvehicle(int numberOfWheels, int maxOccupancy, double velocity, PowerType powerType, boolean publicTravel){
        super(numberOfWheels, maxOccupancy, velocity, powerType);
        this.publicTravel = publicTravel;
    }

}
