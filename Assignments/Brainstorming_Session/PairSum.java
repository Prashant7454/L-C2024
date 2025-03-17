import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int len = scanner.nextInt();

        int[] arr = readArray(scanner, len);

        System.out.println("Enter target sum:");
        int target = scanner.nextInt();
        scanner.close();

        findPairSums(arr, target);
    }

    private static int[] readArray(Scanner scanner, int len) {
        System.out.println("Enter array elements:");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static void findPairSums(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<Integer> usedNumbers = new HashSet<>();
        System.out.println("Pairs with sum " + target + ":");

        for (int num : arr) {
            int complement = target - num;
            if (seenNumbers.contains(complement) && !usedNumbers.contains(complement) && !usedNumbers.contains(num)) {
                System.out.println("{" + complement + ", " + num + "}");
                usedNumbers.add(complement);
                usedNumbers.add(num);
            }
            seenNumbers.add(num);
        }
    }
}