package com.rzeznik.tictactoe;

//Enum powinna byc klasa publiczna
public enum Mark {
	o("kółko") , x("krzyżyk");
	
	public String name;
	
	Mark(String markName) {
		name = markName;
	}
}
