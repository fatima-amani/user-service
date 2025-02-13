package com.fatima.user_service.controller;

import com.fatima.user_service.model.TravelHistory;
import com.fatima.user_service.service.TravelHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel-history")
@RequiredArgsConstructor
public class TravelHistoryController {

    private final TravelHistoryService travelHistoryService; // Fixed dependency injection

    @PostMapping
    public ResponseEntity<TravelHistory> createTravelHistory(@RequestBody TravelHistory travelHistory) {
        return ResponseEntity.ok(travelHistoryService.createTravelHistory(travelHistory));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<TravelHistory>> getTop10Travel(@PathVariable Long userId) {
        return ResponseEntity.ok(travelHistoryService.getUserTravelHistory(userId));
    }
}
