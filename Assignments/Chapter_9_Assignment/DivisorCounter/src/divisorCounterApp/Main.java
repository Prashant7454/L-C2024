package divisorCounterApp;

public class Main {
    public static void main(String[] args) {
        DivisorCounter divisorCounter = new DivisorCounter();
        int count = divisorCounter.countMatchingDivisors(100);
        System.out.println("Count: " + count);
    }
}