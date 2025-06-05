package divisorCounterApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCasesNumber = scanner.nextInt();

        int[] testCases = new int[testCasesNumber];
        for(int i = 0; i < testCasesNumber; i++){
            testCases[i] = scanner.nextInt();
        }

        DivisorCounter divisorCounter = new DivisorCounter();
        for(int i = 0; i < testCasesNumber; i++){
            System.out.println(divisorCounter.getCountOfSameNumberOfPositiveDivisor(testCases[i]));
        }
    }
}