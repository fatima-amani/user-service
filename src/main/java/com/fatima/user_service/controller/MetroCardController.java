package com.fatima.user_service.controller;

import com.fatima.user_service.model.MetroCard;
import com.fatima.user_service.service.MetroCardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metro-card")
@RequiredArgsConstructor
@Slf4j
public class MetroCardController {

    @Autowired
    private MetroCardService metroCardService;

    @PostMapping
    public ResponseEntity<MetroCard> buyMetroCard(@RequestBody MetroCard metroCard) {
        log.info("Issuing new metro card");
        return ResponseEntity.ok(metroCardService.buyMetroCard(metroCard));
    }

    @DeleteMapping("/{cardNumber}")
    public ResponseEntity<String> deleteMetroCard(@PathVariable String cardNumber) {
        log.info("deleting metro card");
        return ResponseEntity.ok(metroCardService.deleteMetroCard(cardNumber));
    }
}

