public class Rail extends Vehicle implements IEngine{
    // 3. extended class 2

    private boolean publicTravel;
    private boolean catering;
    private boolean engineOn;

    public Rail(int numberOfWheels, int maxOccupancy, double velocity, PowerType powerType, boolean publicTravel, boolean catering){
        super(numberOfWheels, maxOccupancy, velocity, powerType);
        this.publicTravel = publicTravel;
        this.catering = catering;
        this.engineOn = false;
    }

    // 5. method overload
    public double accelerate(){
        velocity += 50;
        return velocity;
    }

    public double decelerate(){
        velocity -= 50;
        return velocity;
    }

    public void startEngine(){
        this.engineOn = true;
    }

    public void stopEngine(){
        this.engineOn = false;
    }

    public boolean isPublicTravel() {
        return publicTravel;
    }

    public void setPublicTravel(boolean publicTravel) {
        this.publicTravel = publicTravel;
    }

    public boolean hasCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }
}
