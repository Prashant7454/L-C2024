package divisorCounterApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCasesNumber = scanner.nextInt();

        int[] testCases = new int[testCasesNumber];
        for(int index = 0; index < testCasesNumber; index++){
            testCases[index] = scanner.nextInt();
        }

        DivisorCounter divisorCounter = new DivisorCounter();
        for(int index = 0; index < testCasesNumber; index++){
            try {
                System.out.println(divisorCounter.getCountOfSameNumberOfPositiveDivisor(testCases[index]));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}