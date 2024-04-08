package com.mca.infrastructure.videogame.repositories.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import lombok.Getter;

@Entity
@Table(name = "STOCK")
@Getter
public class StockDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean availability;
    private Timestamp lastUpdated;

    @ManyToOne
    @JoinColumn(name = "VIDEOGAME_ID", nullable = false)
    private VideoGameDto videoGame; // Ya está correctamente definido.
}
