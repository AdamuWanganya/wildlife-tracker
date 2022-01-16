import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Test
    public void Animal_instantiatesCorrectly_true(){
        Animals testAnimals = new Animals();
        assertEquals(true, testAnimals instanceof Animals);
    }

}