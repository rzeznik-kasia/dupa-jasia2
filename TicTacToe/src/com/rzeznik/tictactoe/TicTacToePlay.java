package com.rzeznik.tictactoe;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TicTacToePlay {
	static final int FIRST = 0;
	static List<Player> playerList = new LinkedList<Player>();
	static Grid ticTacToeGrid = new Grid();
	static Player aPlayer;
	
	public static void main(String[] args) {
		GridSpace space;
		String name = "";
		char character;
		
		
		String message = "Pierwszy gracz (" + Mark.o + " - " + Mark.o.name + ") podaje imię: ";
		name = ScanerFacade.writeMessageAndGetNewNameIfDifferentThanProvided(message, name); // porownianie z pustym
		aPlayer = new Player(name, Mark.o);
		playerList.add(aPlayer);
		

		message = "Drugi gracz (" + Mark.x + " - " + Mark.x.name + ") podaje imię: ";
		name = ScanerFacade.writeMessageAndGetNewNameIfDifferentThanProvided(message, name); // porownianie z pierwszym
		aPlayer = new Player(name, Mark.x);
		playerList.add(aPlayer);

		makeIntroduce();
		
		while(true) {
			System.out.println(playerList.get(FIRST).getPlayerName() + ", gdzie umieszczasz swój znak?\n");
			ticTacToeGrid.printGrid();
			
			try {
				character = ScanerFacade.getSpace(ticTacToeGrid.ALLOWED);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			break;	
		}
			
			
			
		
	
	}

	private static void makeIntroduce() {
		System.out.println("\nZapoznajcie się z klawiszami które umożliwią Wam stawianie znaków:");
		//todo odczekac chwile
		ticTacToeGrid.printGrid();
		ticTacToeGrid.resetGrid();
		System.out.println("\nZaczyna " + playerList.get(FIRST).getPlayerName() + ".\n");
	}


}
