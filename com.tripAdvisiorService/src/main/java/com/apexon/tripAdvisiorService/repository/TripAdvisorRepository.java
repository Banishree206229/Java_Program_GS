package com.apexon.tripAdvisiorService.repository;

import com.apexon.tripAdvisiorService.entity.TripAdvisorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripAdvisorRepository extends JpaRepository<TripAdvisorEntity, String> {


}
