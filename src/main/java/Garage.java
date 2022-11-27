import java.util.ArrayList;

public class Garage {
    // 4. Arraylist with class
    private ArrayList<Motorvehicle> backlog;

    public Garage(){
        this.backlog = new ArrayList<>();
    }

    public void addCarToBacklog(Motorvehicle motorvehicle){
        backlog.add(motorvehicle);
    }

    public void removeCarFromBacklog(Motorvehicle motorvehicle){
        backlog.remove(motorvehicle);
    }

    public int calculateBacklogHours(){
        // say it takes on average 3 hours per car to fix
        return backlog.size() * 3;
    }

    public ArrayList<Motorvehicle> getBacklog() {
        return backlog;
    }

    public void setBacklog(ArrayList<Motorvehicle> backlog) {
        this.backlog = backlog;
    }
}
