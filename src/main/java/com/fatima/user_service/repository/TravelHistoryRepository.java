package com.fatima.user_service.repository;

import com.fatima.user_service.model.TravelHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelHistoryRepository extends JpaRepository<TravelHistory, Long> {
    List<TravelHistory> findTop10ByUserIdOrderByTravelDateDesc(Long userId);
}

