package divisorCounterApp;

import java.util.Scanner;

public class Main {

    final static int MAX_NUMBER_OF_TESTCASES = 1000000;
    final static int MAX_TESTCASE_INPUT = 10000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCasesNumber = scanner.nextInt();

        if(testCasesNumber<1 || testCasesNumber> MAX_NUMBER_OF_TESTCASES){
            System.out.println("Test Cases Should be in range 1 to " + MAX_NUMBER_OF_TESTCASES);
            return;
        }

        int[] testCases = new int[testCasesNumber];
        for(int index = 0; index < testCasesNumber; index++){
            testCases[index] = scanner.nextInt();
            if(testCases[index]> MAX_TESTCASE_INPUT){
                System.out.println("Input should be in range 1 to " + MAX_TESTCASE_INPUT);
            }
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