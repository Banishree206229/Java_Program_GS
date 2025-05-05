package com.apexon.tripAdvisiorService.service;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TripAdvisorServiceImpl {

    public int calculateDistance(List<Double> source, List<Double> destination) {

        double EARTH_RADIUS = 6371.0;

        double lat1 = Math.toRadians(source.get(0));
        double lon1 = Math.toRadians(source.get(1));
        double lat2 = Math.toRadians(destination.get(0));
        double lon2 = Math.toRadians(destination.get(1));

        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        double a = Math.sin(dlat / 2) * Math.sin(dlat / 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.sin(dlon / 2) * Math.sin(dlon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (int)(EARTH_RADIUS * c);
    }
}
