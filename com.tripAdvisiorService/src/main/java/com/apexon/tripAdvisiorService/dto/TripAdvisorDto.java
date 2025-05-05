package com.apexon.tripAdvisiorService.dto;
import com.apexon.tripAdvisiorService.enums.BusType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripAdvisorDto {

    private String customerId;
    private String source;
    private String destination;
    private Date date;
    private List<String> passangers;
    private BusType busType;
    private String fare;
}
