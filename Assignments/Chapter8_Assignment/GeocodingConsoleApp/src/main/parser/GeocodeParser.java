package main.parser;

import org.json.JSONArray;
import org.json.JSONObject;
import main.model.Coordinates;

public class GeocodeParser {
    public Coordinates parse(String json) {
        JSONArray results = new JSONArray(json);
        if (results.isEmpty()) {
            return null;
        }

        JSONObject firstResult = results.getJSONObject(0);
        String latitude = firstResult.optString("lat", null);
        String longitude = firstResult.optString("lon", null);

        if (latitude != null && longitude != null) {
            return new Coordinates(latitude, longitude);
        }
        return null;
    }
}
