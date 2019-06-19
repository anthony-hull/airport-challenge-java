import java.util.*;

public class Airport {

    ArrayList<Plane> planes = new ArrayList<>();

    public void landPlane(Plane plane) {
        planes.add(plane);
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }
}
