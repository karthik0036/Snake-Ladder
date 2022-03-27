package com.bridge;

public class SnakeAndLadder {
	
	public static final int NO_PLAY=0;
    public static final int LADDER=1;
    public static final int SNAKE=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1Pos = 0;
		System.out.println("Game begins:Player1 starts at position: "+ player1Pos);
		
		int rollDice= (int) (Math.floor(Math.random() * 10) % 6 )+1;
		System.out.println("value of rolled Dice: "+ rollDice);
		
		 int opt = (int) Math.floor(Math.random() * 10) % 3;
	        switch (opt) {
	            case NO_PLAY:
	                System.out.println("Player1 stays in same position: "+player1Pos);
	                break;
	            case LADDER:
	                player1Pos = player1Pos + rollDice;
	                System.out.println("Player1 moves ahead by: "+player1Pos);
	                break;
	            case SNAKE:
	                player1Pos = player1Pos - rollDice;
	                if(player1Pos < 0){
	                    player1Pos = 0;
	                }
	                System.out.println("Player1 moves back: "+player1Pos);
	                break;
	        }
		

		
		

	}

}
