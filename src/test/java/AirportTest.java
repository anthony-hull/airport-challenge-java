import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


public class AirportTest {
    private Plane mockPlane;
    private Airport airport;
    private Weather mockedWeather;
    @BeforeEach
    public void init() {
        mockPlane = mock(Plane.class);
        mockedWeather = mock(Weather.class);
        airport = new Airport(mockedWeather);
    }

    @Test
    void landPlane() {

        airport.landPlane(mockPlane);
        Assertions.assertEquals(1,airport.getPlanes().size());
    }

    @Test
    void weatherStatus() {
        airport.isSafeWeather();
        verify(mockedWeather).weather();
    }
    
    @Test
    void planeCanTakeOff() {
        Plane the_plane;
        the_plane = airport.takeOff();
        Assertions.assertSame(mockPlane,the_plane);
    }

};


