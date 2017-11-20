package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    
    private List<Movable> groupOfMovables;
    
    public Group() {
        this.groupOfMovables = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        this.groupOfMovables.add(movable);
    }

    @Override
    public String toString() {
        String groupLocations = "";
        for(Movable organism : this.groupOfMovables) {
            
            groupLocations += organism.toString();
            groupLocations += "\n";
        }
        return groupLocations;
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable organism : this.groupOfMovables) {
            organism.move(dx, dy);
        }
    }

}
