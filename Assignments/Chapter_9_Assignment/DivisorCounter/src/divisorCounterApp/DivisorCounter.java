package divisorCounterApp;

public class DivisorCounter {

    public boolean isDivisor(int num, int i) {
        if (num <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        return num % i == 0;
    }

    public int countMatchingDivisors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (isDivisor(n,i) && isDivisor(n + 1,i)) {
                result++;
            }
        }
        return result;
    }
}
