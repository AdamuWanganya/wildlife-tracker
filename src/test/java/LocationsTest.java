import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class LocationsTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void createInstanceOfLocationsClass() {
        Locations location = setUpNewLocation();
        assertEquals(true, location instanceof Locations);
    }
}