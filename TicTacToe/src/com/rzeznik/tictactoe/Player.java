package com.rzeznik.tictactoe;

public class Player {
	private String playerName;
	private Mark playerMark;
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Player(String playerName, Mark playerMark) {
		this.playerName = playerName;
		this.playerMark = playerMark;
	}
	
	
}
