import java.util.Arrays;
import java.util.Scanner;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int arrayLength = scanner.nextInt();
        int[] array = readArray(scanner, arrayLength);
        scanner.close();

        int smallestPositive = findSmallestPositiveNumber(array);
        System.out.println("Smallest Positive Number: " + smallestPositive);
    }

    private static int[] readArray(Scanner scanner, int arrayLength) {
        System.out.println("Enter Array Elements:");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findSmallestPositiveNumber(int[] array) {
        Arrays.sort(array);
        int smallestPositive = 1;

        for (int num : array) {
            if (num == smallestPositive) {
                smallestPositive++;
            }
        }
        return smallestPositive;
    }
}
