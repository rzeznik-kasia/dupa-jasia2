package com.rzeznik.tictactoe;

/**
 * public class zmiana z zewnatrz
 * 
 * @author kasia
 *
 */
public class Grid {
	private char[][] aGrid;
	public final char[] ALLOWED = new char[] { 'q', 'w', 'e', 'a', 's', 'd', 'z', 'x', 'c' };
	
	public Grid() {
		aGrid = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				aGrid[i][j] = ALLOWED[i*3+j];
			}
		}
	}
	
	public void markSpace(char aChar, int index1, int index2) {
		aGrid[index1][index2] = aChar;
	}
	
	public void resetGrid() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				markSpace(' ', i, j);
			}
		}
	}

	public void printGrid() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0)
					System.out.print(" ");
				System.out.print(aGrid[i][j]);
				if (j < 2)
					System.out.print(" | ");
				else
					System.out.println();
			}
			if (i < 2)
				System.out.println("-----------");
		}
	};
	
}
