package com.fatima.user_service.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "metro_card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MetroCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @Column(unique = true, nullable = false)
    private String cardNumber;

    private double balance;

    @PrePersist
    private void generateCardNumber() {
        if (this.cardNumber == null) {
            this.cardNumber = "MC-" + UUID.randomUUID().toString().replace("-", "").substring(0, 12);
        }
    }

    private boolean isActive;
}
