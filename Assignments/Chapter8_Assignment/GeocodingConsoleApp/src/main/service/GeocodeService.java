package main.service;

import main.api.GeocodeApiClient;
import main.parser.GeocodeParser;
import main.model.Coordinates;


public class GeocodeService {
    private final GeocodeApiClient apiClient;
    private final GeocodeParser parser;

    public GeocodeService() {
        this.apiClient = new GeocodeApiClient();
        this.parser = new GeocodeParser();
    }

    public Coordinates getCoordinatesForPlace(String place) throws Exception {
        String json = apiClient.fetchGeocodeJson(place);
        return parser.parse(json);
    }
}
