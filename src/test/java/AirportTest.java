import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


public class AirportTest {
    @Test
    void landPlane() {
        Plane plane = new Plane();
        Airport airport = new Airport();
        airport.landPlane(plane);
        Assertions.assertEquals(1,airport.getPlanes().size());
    }

    Weather mockedWeather = mock(Weather.class);
    @Test
    void weatherStatus() {
        Assertions.assertEquals(1,1);
//        verify(mockedWeather).weather();
    }
};


