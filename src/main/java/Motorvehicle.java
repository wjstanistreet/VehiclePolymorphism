public class Motorvehicle extends Vehicle implements IEngine{
    // 3. extended class 1

    private boolean publicTravel;
    private boolean engineOn;

    public Motorvehicle(int numberOfWheels, int maxOccupancy, double velocity, PowerType powerType, boolean publicTravel) {
        super(numberOfWheels, maxOccupancy, velocity, powerType);
        this.publicTravel = publicTravel;
        this.engineOn = false;
    }

    public void letPassengersIn(int numberOfWaitingPassengers){
        numberOfCurrentPassengers = numberOfWaitingPassengers;
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

    public boolean isPublicTravel() {
        return publicTravel;
    }
}
