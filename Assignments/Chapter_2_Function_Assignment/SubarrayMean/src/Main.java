
import java.util.Scanner;

public class Main {

    public static int[] getPrefixSum(int[] array) {
        int length = array.length;
        int[] prefixSum = new int[length + 1];
        for(int i = 1;i <= length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i - 1];
        }
        return prefixSum;
    }

    public static int getSubarraySum(int[] query, int[] prefixSum) {
        return prefixSum[query[1]] - prefixSum[query[0] - 1];
    }

    public static void processQueries(int[][] queries, int[] prefixSum) {
        for (int[] query : queries) {
            int leftIndex = query[0], rightIndex = query[1];
            int sum = getSubarraySum(query, prefixSum);
            System.out.println(sum / (rightIndex - leftIndex + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int arraySize = scanner.nextInt();
        System.out.println("Enter numbers of query: ");
        int queryNumber = scanner.nextInt();

        System.out.println("Enter Array Element: ");
        int[] array = new int[arraySize];
        for(int i = 0; i<arraySize;i++) {
            array[i] = scanner.nextInt();
        }

        int[][] queries = new int[queryNumber][2];
        System.out.println("Enter Queries: ");
        for(int i = 0; i<queryNumber;i++) {
            System.out.println("Query "+(i+1)+": ");
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        int[] prefixSum = getPrefixSum(array);
        processQueries(queries,prefixSum);
        scanner.close();
    }
}
