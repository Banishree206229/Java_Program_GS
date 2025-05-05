package com.apexon.tripAdvisiorService.feign;

import com.apexon.tripAdvisiorService.dto.LatitudeLongitudeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "trip-service", url = "https://nominatim.openstreetmap.org")
public interface LongitudeLatitideInterface {

    @GetMapping("/search")
    List<LatitudeLongitudeResponse> searchLocation(@RequestParam("format") String format,
                                                   @RequestParam("q") String query);

}
