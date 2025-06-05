package test;

import divisorCounterApp.DivisorCounter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisorCounterTest {

    private final DivisorCounter divisorCounter = new DivisorCounter();

    @org.junit.Test
    public void testCountDivisors_Positive() {
        assertEquals(true, divisorCounter.isDivisor(6,2));
        assertEquals(false, divisorCounter.isDivisor(7,2));
    }

    @Test
    public void testCountDivisors_InvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> divisorCounter.isDivisor(-10,5));
        assertEquals("Input must be a positive integer", exception.getMessage());
    }

    @Test
    public void testCountMatchingDivisors_Sample() {
        assertEquals(2, divisorCounter.getCountOfSameNumberOfPositiveDivisor(15));
    }

    @Test
    public void testCountMatchingDivisors_One() {
        assertEquals(0, divisorCounter.getCountOfSameNumberOfPositiveDivisor(1));
    }

    @Test
    public void testCountMatchingDivisors_InvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> divisorCounter.getCountOfSameNumberOfPositiveDivisor(-5));
        assertEquals("Input must be a positive integer", exception.getMessage());
    }
}

