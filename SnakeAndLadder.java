package com.bridge;

public class SnakeAndLadder {
	
	public static final int NO_PLAY=0;
    public static final int LADDER=1;
    public static final int SNAKE=2;
    public static final int WINNING_Position = 100;

	public static void main(String[] args) {
		int player1Pos = 0;
        System.out.println("Game begins: player1 at position: " + player1Pos);
        while (player1Pos<=100) {
            int rollDice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int opt = (int) Math.floor(Math.random() * 10) % 3;
            switch (opt) {
                case NO_PLAY:
                    System.out.println("Player1 stays in same position: " + player1Pos);
                    break;
                case LADDER:
                    player1Pos = player1Pos+ rollDice;
                    System.out.println("Ladder "+rollDice+" Player1 position: " + player1Pos);
                    break;
                case SNAKE:
                    player1Pos = player1Pos - rollDice;
                    if (player1Pos < 0) {
                        player1Pos = 0;
                    }
                    System.out.println("Snake "+rollDice+" Player1 position: " + player1Pos);
                    break;
            }
        }
        System.out.println("Player1 won: "+player1Pos);
}
}

		
		


