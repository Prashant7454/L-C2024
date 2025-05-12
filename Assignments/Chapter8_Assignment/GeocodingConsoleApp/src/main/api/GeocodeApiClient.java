package main.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class GeocodeApiClient {
    private static final String BASE_URL = "https://geocode.maps.co/search?q=";

    public String fetchGeocodeJson(String place) throws Exception {
        String encodedPlace = URLEncoder.encode(place, "UTF-8");
        URL url = new URL(BASE_URL + encodedPlace);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int code = conn.getResponseCode();
        if (code != 200) {
            throw new RuntimeException("API response code: " + code);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            return json.toString();
        }
    }
}
