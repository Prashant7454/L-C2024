package divisorCounterApp;

public class DivisorCounter {

    public boolean isDivisor(int number, int i) {
        if (number <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        return number % i == 0;
    }

    public int getCountOfSameNumberOfPositiveDivisor(int number){
        if (number <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int count = 0;
        for(int i = 1;i<number;i++){
            int firstCount = countDivisors(i);
            int secondCount = countDivisors(i+1);
            if(firstCount==secondCount){
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
        for (int i = 1; i < number; i++) {
            if (isDivisor(number,i)) {
                result++;
            }
        }
        return result;
    }
}
