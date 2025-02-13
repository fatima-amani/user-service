package com.fatima.user_service.controller;

import com.fatima.user_service.model.MetroCard;
import com.fatima.user_service.service.MetroCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metrocard")
@RequiredArgsConstructor
public class MetroCardController {
    private final MetroCardService metroCardService;

    @PostMapping
    public ResponseEntity<MetroCard> buyMetroCard(@RequestBody MetroCard metroCard) {
        return ResponseEntity.ok(metroCardService.buyMetroCard(metroCard));
    }
}

