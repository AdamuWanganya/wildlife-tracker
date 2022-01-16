import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SightingsTest {

    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void createInstanceOfSightingsClass_true() {

        Sightings sighting = setUpNewSighting();
        assertEquals(true, sighting instanceof Sightings);
    }

    @Test
    public void allInstancesAreSaved() {
        Sightings sightings=setUpNewSighting();
        Sightings otherSighting=new Sightings(-1,1,1);
        try {
            sightings.save();
            otherSighting.save();
            assertTrue(Sightings.find(sightings.getId()).equals(sightings));
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}

