package com.fatima.user_service.model;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.time.LocalDateTime;

@Entity
@Table(name = "travel_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TravelHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sourceStation;
    private Long destinationStation;
    private double fare;
    private LocalDateTime travelDate;

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
}
