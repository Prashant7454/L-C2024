package divisorCounterApp;

public class DivisorCounter {

    public boolean isDivisor(int number, int divisor) {
        if (number <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        return number % divisor == 0;
    }

    public int getCountOfSameNumberOfPositiveDivisor(int number){
        if (number <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int count = 0;
        for(int currentNumber = 1;currentNumber<=number;currentNumber++){
            int firstDivisorCount = countDivisors(currentNumber);
            int secondDivisorCount = countDivisors(currentNumber+1);
            if(firstDivisorCount==secondDivisorCount){
                count++;
            }
        }
        return count;
    }

    public int countDivisors(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int result = 0;
        for (int divisor = 1; divisor < number; divisor++) {
            if (isDivisor(number,divisor)) {
                result++;
            }
        }
        return result;
    }
}
