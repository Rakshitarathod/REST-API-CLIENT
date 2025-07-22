package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class WeatherApiClient {

    public static String getWeatherData(String city, String apiKey) {
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                "&appid=" + apiKey + "&units=metric";

        StringBuilder response = new StringBuilder();

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        }

        return response.toString();
    }

    public static void displayWeather(String json) {
        try {
            JSONObject obj = new JSONObject(json);

            // Extracting fields
            String cityName = obj.getString("name");
            String country = obj.getJSONObject("sys").getString("country");
            JSONObject main = obj.getJSONObject("main");
            double temperature = main.getDouble("temp");
            int humidity = main.getInt("humidity");
            String weatherDescription = obj.getJSONArray("weather").getJSONObject(0).getString("description");
            double windSpeed = obj.getJSONObject("wind").getDouble("speed");

            // Output
            System.out.println("\n📍 Location : " + cityName + ", " + country);
            System.out.println("🌥️  Weather  : " + weatherDescription);
            System.out.println("🌡️  Temp     : " + temperature + " °C");
            System.out.println("💧 Humidity  : " + humidity + " %");
            System.out.println("🍃 Wind Speed: " + windSpeed + " m/s");

        } catch (Exception e) {
            System.err.println("❌ Failed to parse JSON: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        // 🔑 Replace with your actual API key
        String apiKey = "3e16f0c12a31d48d67235a3194896f07";

        String jsonResponse = getWeatherData(city, apiKey);

        if (!jsonResponse.isEmpty()) {
            displayWeather(jsonResponse);
        } else {
            System.out.println("❌ No data received.");
        }

        sc.close();
    }
}
