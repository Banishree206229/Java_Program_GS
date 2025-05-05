package com.apexon.tripAdvisiorService.entity;

import com.apexon.tripAdvisiorService.enums.BusType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trip_advisor")
public class TripAdvisorEntity {

    @Id
    private String customerId;
    private String source;
    private String destination;
    private Date date;
    private List<String> passangers;
    //@Column(name = "bus_type", nullable = false)
    private BusType busType;
    private String fare;
}
