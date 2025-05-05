package test;

import main.parser.GeocodeParser;

public class TestMain {
    public static void main(String[] args) {
        String location = "SilkBoard";
        TestApi obj = new TestApi();
        String response = "";
        try{
            response = obj.testFetchGeocodeJson(location);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Response: " + response);
    }
}
