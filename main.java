package game; 

import java.util.Scanner;

public class main
{			
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		boolean isRed;
		System.out.println("Welcome to Stratego! ");
		System.out.println();
		System.out.println("Player 1 do you want to be red or blue?");
		String color = in.nextLine();
		if(color.equalsIgnoreCase("red")) // set player color
		{
			System.out.println("Player 1, you are red!");
			isRed = true;
			System.out.println();
			System.out.println("Player 2, that makes you blue!");
		}
		else
		{
			System.out.println("Player 1, you are blue!");
			isRed = false;
			System.out.println();
			System.out.println("Player 2, that makes you red!");
		}
		System.out.println();
		System.out.println("One moment please... generating the board. Press enter to continue: "); // initialize game
		in.nextLine();
		Board map = new Board();
		map.generateBoard();
		System.out.println("Board generated!");
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("\033[1mHere is a list of the piece descriptions:\033[0m"); // bold text
		System.out.println();
		
		Marshal marshal = new Marshal();
		General general = new General();
		Colonel colonel = new Colonel();
		Major major = new Major();
		Captain captain = new Captain();
		Lieutenant lieutenant = new Lieutenant();
		Sergeant sergeant = new Sergeant();
		Miner miner = new Miner();
		Scout scout = new Scout();
		Spy spy = new Spy();
		Bomb bomb = new Bomb();
		Flag flag = new Flag();
		
		gamePiece pieces[] = {marshal, general, colonel, major, captain, lieutenant, sergeant, miner, scout, spy, bomb, flag}; // polymorphism to print piece description

		for(int i = 0; i < pieces.length; i++)
		{
			System.out.println(pieces[i].getPieceDescription()); // print out pieces
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		int turnCount = 0;
		int totalArmyCount = 40;
		int player1Wins = 0;
		int player2Wins = 0;
		boolean flagCaptured = false;			
		
		while(!flagCaptured || totalArmyCount != 0) // player wins if flag is captured or player runs out of pieces
		{
			if(turnCount % 2 == 0) // alternate turns
			{
				System.out.println();
				map.seeBoard(turnCount, isRed);
				System.out.println();
				System.out.println("Player 1 choose a command: attack or move");
				String choice = in.nextLine();
				if(choice.equalsIgnoreCase("move"))
				{
					System.out.println("Please access the piece you'd like to move: (row, column)");
					int row = in.nextInt(); int col = in.nextInt();
					map.move(row, col);
				}
				else if(choice.equalsIgnoreCase("attack"))
				{
					System.out.println("Please access your piece and the one you wish to attack (row, column) (enemy row/column)");
					int row = in.nextInt(); int col = in.nextInt(); int otherRow = in.nextInt(); int otherCol = in.nextInt();
					if(map.attack(row, col, otherRow, otherCol) == "You win!")
					{
						flagCaptured = true;
						player1Wins++;
					}
					else
					{
						map.attack(row, col, otherRow, otherCol);
					}
				}
				else
				{
					System.out.println("Please select a valid command! ");
					System.out.println();
				}
			}
			else
			{
				System.out.println("Player 2 choose a command: attack or move");
				System.out.println();
				map.seeBoard(turnCount, isRed);
				System.out.println();
				String decision = in.nextLine();
				if(decision.equalsIgnoreCase("move"))
				{
					System.out.println("Please access the piece you'd like to move: (row, column)");
					int row = in.nextInt(); int col = in.nextInt();
					map.move(row, col);
				}
				else if(decision.equalsIgnoreCase("attack"))
				{
					System.out.println("Please access your piece and the one you wish to attack (row, column) (enemy row/column)");
					int row = in.nextInt(); int col = in.nextInt(); int otherRow = in.nextInt(); int otherCol = in.nextInt();
					if(map.attack(row, col, otherRow, otherCol) == "You win!")
					{
						flagCaptured = true;
						player2Wins++;
					}
					else
					{
						map.attack(row, col, otherRow, otherCol);
					}
				}
				else
				{
					System.out.println("Please select a valid command! ");
					System.out.println();
				}
			}
			turnCount++;
		}
		if(player1Wins == 1)
		{
			System.out.println("Player 1 captured your flag!");
		}
		else if(player2Wins == 1)
		{
			System.out.println("Player 2 captured your flag!");
		}
	}
}
