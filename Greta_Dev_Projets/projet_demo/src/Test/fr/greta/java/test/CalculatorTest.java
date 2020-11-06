package Test.fr.greta.java.test;

import fr.greta.java.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void verifyZeroPlusZer() {
        assertEquals(0,calculator.addition(0,0));
    }

}
