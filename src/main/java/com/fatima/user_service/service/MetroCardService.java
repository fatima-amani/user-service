package com.fatima.user_service.service;

import com.fatima.user_service.model.MetroCard;
import com.fatima.user_service.repository.MetroCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MetroCardService {
    private final MetroCardRepository metroCardRepository;

    public MetroCard buyMetroCard(MetroCard metroCard) {
        return metroCardRepository.save(metroCard);
    }

    public Optional<MetroCard> getMetroCardByUserId(Long userId) {
        return metroCardRepository.findByUserId(userId);
    }
}

