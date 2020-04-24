package com.solid.SOLID.liskovbad;

public class Main {

	public static void main(String[] args) {
		
		Board twoBoard = new TwoDBoard();
		Board threeBoard = new ThreeDBoard();
		
		twoBoard.addPoint(11, 55);
		twoBoard.addPoint(1, 5, 7);
		
		twoBoard.removePoint(11, 55);
		
		threeBoard.addPoint(4, 2, 1);
	}
}
