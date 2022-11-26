public class Motorvehicle extends Vehicle{

    private boolean publicTravel;
    private boolean engineOn;

    public Motorvehicle(int numberOfWheels, int maxOccupancy, double velocity, PowerType powerType, boolean publicTravel){
        super(numberOfWheels, maxOccupancy, velocity, powerType);
        this.publicTravel = publicTravel;
        this.engineOn = false;
    }

    public void startEngine(){
        this.engineOn = true;
    }

    public void stopEngine(){
        this.engineOn = false;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

}
