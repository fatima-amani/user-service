package com.fatima.user_service.controller;

import com.fatima.user_service.model.TravelHistory;
import com.fatima.user_service.service.TravelHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel-history")
@RequiredArgsConstructor
@Slf4j
public class TravelHistoryController {

    private final TravelHistoryService travelHistoryService; // Fixed dependency injection

    @PostMapping
    public ResponseEntity<TravelHistory> createTravelHistory(@RequestBody TravelHistory travelHistory) {
        log.info("Adding to travel history");
        return ResponseEntity.ok(travelHistoryService.createTravelHistory(travelHistory));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<TravelHistory>> getTop10Travel(@PathVariable Long userId) {
        log.info("Fetching top 10 travel history of {}",userId);
        return ResponseEntity.ok(travelHistoryService.getUserTravelHistory(userId));
    }
}
