package main.app;

import main.model.Coordinates;
import main.service.GeocodeService;

import java.util.Scanner;

public class GeocodingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a place name: ");
            String place = scanner.nextLine().trim();

            if (place.isEmpty()) {
                System.out.println("Place name cannot be empty.");
                return;
            }

            GeocodeService service = new GeocodeService();
            Coordinates coordinates = service.getCoordinatesForPlace(place);

            if (coordinates != null) {
                System.out.println("Latitude: " + coordinates.getLatitude());
                System.out.println("Longitude: " + coordinates.getLongitude());
            } else {
                System.out.println("No coordinates found for the given place.");
            }
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
