import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void testAdd() {
        Calculator C = new Calculator();
        assertEquals(2,C.add(1,1));
    }
}