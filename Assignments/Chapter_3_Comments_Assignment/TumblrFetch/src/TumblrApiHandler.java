import java.util.Scanner;

public class TumblrApiHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the Tumblr blog name: ");
            String blogName = scanner.nextLine().trim();

            System.out.print("Enter the range (e.g., 1-5): ");
            String rangeInput = scanner.nextLine().trim();

            int[] range = InputValidator.parseRange(rangeInput);
            if (range == null) {
                System.out.println("Invalid range format. Please use 'start-end' (e.g., 1-5).");
                return;
            }

            String jsonResponse = TumblrApiService.fetchTumblrData(blogName, range[0], range[1]);
            if (jsonResponse != null) {
                TumblrApiParser.parseBlogInfo(jsonResponse);
                TumblrApiParser.parseImageUrls(jsonResponse, range[0], range[1]);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
