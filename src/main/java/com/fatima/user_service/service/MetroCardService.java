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
        metroCard.setActive(true);
        return metroCardRepository.save(metroCard);
    }

    public String deleteMetroCard(String cardNumber) {
        MetroCard deletedCard = metroCardRepository.findByCardNumber(cardNumber);
        deletedCard.setActive(false);
        return "Deleted card "+cardNumber+" successfully";
    }
}

