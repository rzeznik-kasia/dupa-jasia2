package com.rzeznik.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScanerFacadeTest {

	@Test
	public void whenNoNameIsProvidedThenSystemAsksOnceMore() {
		//given
		String message = "Pierwszy gracz (" + Mark.o + " - " + Mark.o.name + ") podaje imię: ";
		String str  = "";
		//when
		str = ScanerFacade.writeMessageAndGetNewNameIfDifferentThanProvided(message, str);
		//then
		assertNotEquals(str, "");
	}
	
	@Test
	public void whenFirstNameIsSameAsSecondThenAskForSecond() {
		//given
		String message1 = "Pierwszy gracz (" + Mark.o + " - " + Mark.o.name + ") podaje imię: ";
		String message2 = "Drugi gracz (" + Mark.x + " - " + Mark.x.name + ") podaje imię: ";
		String name1 = "", name2;
		//when
		name1 = ScanerFacade.writeMessageAndGetNewNameIfDifferentThanProvided(message1, name1);
		name2 = ScanerFacade.writeMessageAndGetNewNameIfDifferentThanProvided(message2, name1);

		//then
		assertNotEquals(name1, name2);
	}



}
