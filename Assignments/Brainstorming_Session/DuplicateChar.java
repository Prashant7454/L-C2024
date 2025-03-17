import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.next();
        scanner.close();

        Map<Character, Integer> charFrequency = countCharacterFrequency(str);
        displayDuplicateCharacters(charFrequency);
    }

    private static Map<Character, Integer> countCharacterFrequency(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        return charMap;
    }

    private static void displayDuplicateCharacters(Map<Character, Integer> charMap) {
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
