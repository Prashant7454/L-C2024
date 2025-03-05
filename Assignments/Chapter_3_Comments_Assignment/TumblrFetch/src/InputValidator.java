public class InputValidator {

    public static int[] parseRange(String rangeInput) {
        try {
            String[] parts = rangeInput.split("-");
            if (parts.length != 2) return null;

            int start = Integer.parseInt(parts[0].trim());
            int end = Integer.parseInt(parts[1].trim());

            if (start > 0 && end >= start) {
                return new int[]{start, end};
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in range.");
        }
        return null;
    }
}
