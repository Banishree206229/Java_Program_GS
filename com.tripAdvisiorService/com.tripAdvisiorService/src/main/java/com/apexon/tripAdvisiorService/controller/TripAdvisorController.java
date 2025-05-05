package com.apexon.tripAdvisiorService.controller;

import com.apexon.tripAdvisiorService.dto.TripAdvisorDto;
import com.apexon.tripAdvisiorService.service.TripAdvisorServiceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tripAdvisor")
public class TripAdvisorController {

    @Autowired
    TripAdvisorServiceImpl tripAdvisorService;

    @Value("${api.base.url}")
    String url;

    @PostMapping("/customer_details")
    public int save(@RequestBody TripAdvisorDto tripAdvisorDto) throws IOException {
        List<Double> sourceLatLon = findLattitudeAndLongitude(tripAdvisorDto.getSource());
        List<Double> destinationLatLon = findLattitudeAndLongitude(tripAdvisorDto.getDestination());
        return tripAdvisorService.calculateDistance(sourceLatLon,destinationLatLon);
    }

    public List<Double> findLattitudeAndLongitude(String location) throws IOException {
        String path = url+location;
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Java Geocoding Client");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        JSONObject result = null;
        JSONArray jsonArray = new JSONArray(response.toString());
        if (jsonArray.length() > 0) {
            result  = jsonArray.getJSONObject(0);
        }

        List<Double> list = new ArrayList<>();
        if (result != null) {
            double lat = result.getDouble("lat");
            double lon = result.getDouble("lon");
            list.add(lat);
            list.add(lon);
        } else {
            System.out.println("Location not found.");
        }
        return list;
    }
}
