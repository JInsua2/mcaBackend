package com.mca.infrastructure.videogame.integrationevents;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UpdateStockEvent implements Serializable {
	private Long stock_id;

	private boolean availability;

	private Timestamp time_update;


}
