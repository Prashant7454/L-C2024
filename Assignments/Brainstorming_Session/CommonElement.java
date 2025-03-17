import java.util.*;

public class CommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of arrays: ");
        int numArrays = scanner.nextInt();

        System.out.println("Enter size of arrays: ");
        int len = scanner.nextInt();

        List<int[]> arrays = new ArrayList<>();
        for (int i = 0; i < numArrays; i++) {
            arrays.add(readArray(scanner, len, "Array " + (i + 1)));
        }

        List<Integer> commonElements = findCommonElements(arrays);

        System.out.println("Common Elements: " + commonElements);
    }

    private static int[] readArray(Scanner scanner, int len, String arrayName) {
        System.out.println("Enter " + arrayName + ": ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static List<Integer> findCommonElements(List<int[]> arrays) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int totalArrays = arrays.size();

        for (int[] arr : arrays) {
            processArray(arr, frequencyMap);
        }

        List<Integer> commonElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == totalArrays) {
                commonElements.add(entry.getKey());
            }
        }
        return commonElements;
    }

    private static void processArray(int[] arr, Map<Integer, Integer> frequencyMap) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }
        for (int num : uniqueElements) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
    }
}