package com.mca.infrastructure.videogame.repositories.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Getter;

@Entity
@Table(name = "VIDEOGAME")
@Getter
public class VideoGameDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "SAGA_ID")
    private SagaDto saga;

    @OrderBy("validFrom DESC")
    @OneToMany(mappedBy = "videoGame", fetch = FetchType.EAGER)
    private Set<PromotionDto> promotions;

    @OrderBy("lastUpdated DESC")
    @OneToMany(mappedBy = "videoGame", fetch = FetchType.EAGER)
    private Set<StockDto> stocks;
}
