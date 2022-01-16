import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Test
    public void Animal_instantiatesCorrectly_true(){
        Animals testAnimals = new Animals();
        assertEquals(true, testAnimals instanceof Animals);
    }

    @Test
    public void allInstancesAreSaved() {
        Animals testAnimal=setUpNewAnimal();
        testAnimal.save();
        assertTrue(Animals.all().get(0).equals(testAnimal));
    }

}