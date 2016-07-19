package com.rzeznik.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class ScanerFacade {
	static Scanner scaner = new Scanner(System.in);
	//
	//public static String getNameForDiscriminator(Object mark);
	public static String writeMessageAndGetNewNameIfDifferentThanProvided(String message, String secondName) {	
		String name;
		
		while(true) {
			System.out.println(message);
			name = scaner.nextLine();
			if(!name.equals("") && !name.equals(secondName)) break;
		}
		
		return name;
		
	}

	public static char getCharacter() throws IOException {
        Reader reader = new InputStreamReader(System.in);
        char character = (char)reader.read();
		return character;
	};
}
