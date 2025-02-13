package com.fatima.user_service.service;

import com.fatima.user_service.model.TravelHistory;
import com.fatima.user_service.repository.TravelHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TravelHistoryService {

    private final TravelHistoryRepository travelHistoryRepository;

    public TravelHistory createTravelHistory(TravelHistory travelHistory) {
        return travelHistoryRepository.save(travelHistory);
    }

    public List<TravelHistory> getUserTravelHistory(Long userId) {
        return travelHistoryRepository.findTop10ByUserIdOrderByTravelDateDesc(userId);
    }
}
