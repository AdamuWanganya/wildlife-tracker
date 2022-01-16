import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;



public class RangersTest extends TestCase {


    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void createInstanceOfRangersClass_true() {
        Rangers ranger = setUpNewRanger();
        assertEquals(true, ranger instanceof Rangers);
    }
}