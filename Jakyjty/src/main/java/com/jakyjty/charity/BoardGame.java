package com.jakyjty.charity;

import lombok.Data;

@Data
public class BoardGame {
	
	private String nameOfGame;
	private Integer minNoOfPlayers;
	private Integer maxNoOfPlayers;
	private Integer actualNoOfPlayers;
	private Boolean gameRunning = false;

}
