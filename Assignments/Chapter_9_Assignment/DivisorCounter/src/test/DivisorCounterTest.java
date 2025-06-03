package test;

import divisorCounterApp.DivisorCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisorCounterTest {

    private final DivisorCounter divisorCounter = new DivisorCounter();


    @Test
    public void testCountDivisors_InvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> divisorCounter.isDivisor(-10,5));
        assertEquals("Input must be a positive integer", exception.getMessage());
    }

    @Test
    public void testCountMatchingDivisors_InvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> divisorCounter.countMatchingDivisors(-5));
        assertEquals("Input must be a positive integer", exception.getMessage());
    }
}

