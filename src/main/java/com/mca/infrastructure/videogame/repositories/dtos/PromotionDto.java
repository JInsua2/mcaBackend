package com.mca.infrastructure.videogame.repositories.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PROMOTION")
@Getter
@Setter
public class PromotionDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp validFrom;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "VIDEOGAME_ID", nullable = false)
    private VideoGameDto videoGame;
}

