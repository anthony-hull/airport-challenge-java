import java.nio.file.WatchEvent;
import java.util.*;

public class Airport {

    Weather weather;


    public Airport(Weather mockedWeather) {
        weather = mockedWeather;
    }

    ArrayList<Plane> planes = new ArrayList<>();

    public void landPlane(Plane plane) {
        planes.add(plane);
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public boolean isSafeWeather() {
        return weather.weather();
    }

    public Plane takeOff() {
        Plane the_plane;
        if( planes.size() > 0 ) {
            int index = planes.size() - 1;
            the_plane = planes.get(index);
            planes.remove(index);
            return the_plane;
        }
        return null;
    }
}