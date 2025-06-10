<<<<<<< HEAD
package game; import java.util.Random; import java.util.Scanner;

public class Board 
{
	private static final String ANSI_RESET = "\u001B[0m"; 
    private static final String ANSI_RED = "\u001B[31m"; 
    private static final String ANSI_BLUE = "\u001B[34m";
    
	public gamePiece [][] board = new gamePiece[10][10];
	Random index = new Random();
	Scanner in = new Scanner(System.in);
	
	public Board() 
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				board[i][j] = null;
			}
		}
	}

	void setMarshall()
	{
		Marshal marshall = new Marshal(); 
		marshall.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != marshall.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = marshall;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Marshal bmarshall = new Marshal(); 
		bmarshall.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bmarshall.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = bmarshall;
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setGeneral()
	{
		General general = new General();
		general.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != general.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = general;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		General bgeneral = new General();
		bgeneral.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bgeneral.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = bgeneral;
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setColonel()
	{
		Colonel colonel1 = new Colonel();
		Colonel colonel2 = new Colonel();
		colonel1.setColor("red");
		colonel2.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != colonel1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = colonel1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = colonel2;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Colonel bcolonel1 = new Colonel();
		Colonel bcolonel2 = new Colonel();
		bcolonel1.setColor("blue");
		bcolonel2.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bcolonel1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bcolonel1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bcolonel2;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setMajor()
	{
		Major major1 = new Major();
		Major major2 = new Major();
		Major major3 = new Major();
		major1.setColor("red");
		major2.setColor("red");
		major3.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != major1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = major1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = major2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = major3;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Major bmajor1 = new Major();
		Major bmajor2 = new Major();
		Major bmajor3 = new Major();
		bmajor1.setColor("blue");
		bmajor2.setColor("blue");
		bmajor3.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bmajor1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bmajor1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bmajor2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bmajor3;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setCaptain()
	{
		Captain captain1 = new Captain();
		Captain captain2 = new Captain();
		Captain captain3 = new Captain();
		Captain captain4 = new Captain();
		captain1.setColor("red");
		captain2.setColor("red");
		captain3.setColor("red");
		captain4.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != captain1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = captain1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = captain2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = captain3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = captain4;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Captain bcaptain1 = new Captain();
		Captain bcaptain2 = new Captain();
		Captain bcaptain3 = new Captain();
		Captain bcaptain4 = new Captain();
		bcaptain1.setColor("blue");
		bcaptain2.setColor("blue");
		bcaptain3.setColor("blue");
		bcaptain4.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bcaptain1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bcaptain1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bcaptain2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bcaptain3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bcaptain4;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setLieutenant()
	{
		Lieutenant lieutenant1 = new Lieutenant();
		Lieutenant lieutenant2 = new Lieutenant();
		Lieutenant lieutenant3 = new Lieutenant();
		Lieutenant lieutenant4 = new Lieutenant();
		lieutenant1.setColor("red");
		lieutenant2.setColor("red");
		lieutenant3.setColor("red");
		lieutenant4.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != lieutenant1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = lieutenant1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = lieutenant2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = lieutenant3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = lieutenant4;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Lieutenant blieutenant1 = new Lieutenant();
		Lieutenant blieutenant2 = new Lieutenant();
		Lieutenant blieutenant3 = new Lieutenant();
		Lieutenant blieutenant4 = new Lieutenant();
		blieutenant1.setColor("blue");
		blieutenant2.setColor("blue");
		blieutenant3.setColor("blue");
		blieutenant4.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != blieutenant1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = blieutenant1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = blieutenant2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = blieutenant3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = blieutenant4;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setSergeant()
	{
		Sergeant sergeant1 = new Sergeant();
		Sergeant sergeant2 = new Sergeant();
		Sergeant sergeant3 = new Sergeant();
		Sergeant sergeant4 = new Sergeant();
		sergeant1.setColor("red");
		sergeant2.setColor("red");
		sergeant3.setColor("red");
		sergeant4.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != sergeant1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = sergeant1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = sergeant2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = sergeant3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = sergeant4;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Sergeant bsergeant1 = new Sergeant();
		Sergeant bsergeant2 = new Sergeant();
		Sergeant bsergeant3 = new Sergeant();
		Sergeant bsergeant4 = new Sergeant();
		bsergeant1.setColor("blue");
		bsergeant2.setColor("blue");
		bsergeant3.setColor("blue");
		bsergeant4.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bsergeant1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bsergeant1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bsergeant2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bsergeant3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bsergeant4;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setMiner()
	{
		Miner miner1 = new Miner();
		Miner miner2 = new Miner();
		Miner miner3 = new Miner();
		Miner miner4 = new Miner();
		Miner miner5 = new Miner();
		miner1.setColor("red");
		miner2.setColor("red");
		miner3.setColor("red");
		miner4.setColor("red");
		miner5.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != miner1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = miner1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = miner2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = miner3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = miner4;
				}
				else if(count == 4)
				{
					board[rowIndex][colIndex] = miner5;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Miner bminer1 = new Miner();
		Miner bminer2 = new Miner();
		Miner bminer3 = new Miner();
		Miner bminer4 = new Miner();
		Miner bminer5 = new Miner();
		bminer1.setColor("blue");
		bminer2.setColor("blue");
		bminer3.setColor("blue");
		bminer4.setColor("blue");
		bminer5.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bminer1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bminer1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bminer2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bminer3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bminer4;
				}
				else if(bcount == 4)
				{
					board[browIndex][bcolIndex] = bminer5;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setScout()
	{
		Scout scout1 = new Scout();
		Scout scout2 = new Scout();
		Scout scout3 = new Scout();
		Scout scout4 = new Scout();
		Scout scout5 = new Scout();
		Scout scout6 = new Scout();
		Scout scout7 = new Scout();
		Scout scout8 = new Scout();
		scout1.setColor("red");
		scout2.setColor("red");
		scout3.setColor("red");
		scout4.setColor("red");
		scout5.setColor("red");
		scout6.setColor("red");
		scout7.setColor("red");
		scout8.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != scout1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = scout1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = scout2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = scout3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = scout4;
				}
				else if(count == 4)
				{
					board[rowIndex][colIndex] = scout5;
				}
				else if(count == 5)
				{
					board[rowIndex][colIndex] = scout6;
				}
				else if(count == 6)
				{
					board[rowIndex][colIndex] = scout7;
				}
				else if(count == 7)
				{
					board[rowIndex][colIndex] = scout8;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Scout bscout1 = new Scout();
		Scout bscout2 = new Scout();
		Scout bscout3 = new Scout();
		Scout bscout4 = new Scout();
		Scout bscout5 = new Scout();
		Scout bscout6 = new Scout();
		Scout bscout7 = new Scout();
		Scout bscout8 = new Scout();
		bscout1.setColor("blue");
		bscout2.setColor("blue");
		bscout3.setColor("blue");
		bscout4.setColor("blue");
		bscout5.setColor("blue");
		bscout6.setColor("blue");
		bscout7.setColor("blue");
		bscout8.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bscout1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bscout1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bscout2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bscout3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bscout4;
				}
				else if(bcount == 4)
				{
					board[browIndex][bcolIndex] = bscout5;
				}
				else if(bcount == 5)
				{
					board[browIndex][bcolIndex] = bscout6;
				}
				else if(bcount == 6)
				{
					board[browIndex][bcolIndex] = bscout7;
				}
				else if(bcount == 7)
				{
					board[browIndex][bcolIndex] = bscout8;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setSpy()
	{
		Spy spy = new Spy();
		spy.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != spy.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = spy;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Spy bspy = new Spy();
		bspy.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bspy.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = bspy;
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setBomb()
	{
		Bomb bomb1 = new Bomb();
		Bomb bomb2 = new Bomb();
		Bomb bomb3 = new Bomb();
		Bomb bomb4 = new Bomb();
		Bomb bomb5 = new Bomb();
		Bomb bomb6 = new Bomb();
		bomb1.setColor("red");
		bomb2.setColor("red");
		bomb3.setColor("red");
		bomb4.setColor("red");
		bomb5.setColor("red");
		bomb6.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != bomb1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = bomb1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = bomb2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = bomb3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = bomb4;
				}
				else if(count == 4)
				{
					board[rowIndex][colIndex] = bomb5;
				}
				else if(count == 5)
				{
					board[rowIndex][colIndex] = bomb6;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Bomb bbomb1 = new Bomb();
		Bomb bbomb2 = new Bomb();
		Bomb bbomb3 = new Bomb();
		Bomb bbomb4 = new Bomb();
		Bomb bbomb5 = new Bomb();
		Bomb bbomb6 = new Bomb();
		bbomb1.setColor("blue");
		bbomb2.setColor("blue");
		bbomb3.setColor("blue");
		bbomb4.setColor("blue");
		bbomb5.setColor("blue");
		bbomb6.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bbomb1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bbomb1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bbomb2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bbomb3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bbomb4;
				}
				else if(bcount == 4)
				{
					board[browIndex][bcolIndex] = bbomb5;
				}
				else if(bcount == 5)
				{
					board[browIndex][bcolIndex] = bbomb6;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setFlag()
	{
		Flag redFlag = new Flag();
		redFlag.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != redFlag.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = redFlag;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Flag blueFlag = new Flag();
		blueFlag.setColor("blue");
		int blueCount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(blueCount != blueFlag.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = blueFlag;
				blueCount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void generateBoard()
	{
		setMarshall();
		setGeneral();
		setColonel();
		setMajor();
		setCaptain();
		setLieutenant();
		setSergeant();
		setMiner();
		setScout();
		setSpy();
		setBomb();
		setFlag();
		board[4][2] = null;
		board[4][3] = null;
		board[5][2] = null;
		board[5][3] = null;
		board[4][6] = null;
		board[4][7] = null;
		board[5][6] = null;
		board[5][7] = null;
	}
	
	void seeBoard(int turn, boolean color)
	{
		gamePiece [][] redArray = new gamePiece[10][10];
		gamePiece [][] blueArray = new gamePiece[10][10];
		if(turn % 2 == 0 && color) // player 1s turn and red
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 redArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(redArray[i][j] != null && redArray[i][j].getColor() == "blue")
					{
						redArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(redArray[i][j] != null)
					{
						if(redArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_BLUE + "  " + redArray[i][j].getNumber() + "  " + ANSI_RESET);
						}
						else
						{
							System.out.print(ANSI_RED + "  " + redArray[i][j].getNumber() + "  " + ANSI_RESET);
						}
					}
					else
					{
						System.out.print("  " + redArray[i][j] + "  ");
					}
				}
				System.out.println();
			}
		}
		else if(turn % 2 == 0 && !color) // player 1 turn and blue
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 blueArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null && blueArray[i][j].getColor() == "red")
					{
						blueArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null)
					{
						if(blueArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_RED + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
						}
						else
						{
							if(blueArray[i][j] == null)
							{
								System.out.print(ANSI_BLUE + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
							else
							{
								System.out.print(ANSI_BLUE + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
						}
					}
					else
					{
						if(blueArray[i][j] == null)
						{
							System.out.print(blueArray[i][j] + " "); // print board after omission
						}
						else
						{
							System.out.print(" " + blueArray[i][j] + " "); // print board after omission
						}
					}
				}
				System.out.println();
			}
		}
		else if(turn % 2 == 1 && color) // player 2 turn and red
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 redArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(redArray[i][j] != null && redArray[i][j].getColor() == "blue")
					{
						redArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null)
					{
						if(blueArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_BLUE + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
						}
						else
						{
							if(blueArray[i][j] == null)
							{
								System.out.print(ANSI_RED + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
							else
							{
								System.out.print(ANSI_RED + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
						}
					}
					else
					{
						if(blueArray[i][j] == null)
						{
							System.out.print(blueArray[i][j] + " "); // print board after omission
						}
						else
						{
							System.out.print(" " + blueArray[i][j] + " "); // print board after omission
						}
					}
				}
				System.out.println();
			}
		}
		else
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 blueArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null && blueArray[i][j].getColor() == "red")
					{
						blueArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null)
					{
						if(blueArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_RED + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
						}
						else
						{
							if(blueArray[i][j] == null)
							{
								System.out.print(ANSI_BLUE + blueArray[i][j].getNumber() + " " + ANSI_RESET); // space nulls to align with pieces

							}
							else
							{
								System.out.print(ANSI_BLUE + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
						}
					}
					else
					{
						if(blueArray[i][j] == null)
						{
							System.out.print(blueArray[i][j] + " "); // print board after omission
						}
						else
						{
							System.out.print(" " + blueArray[i][j] + " "); // print board after omission
						}
					}
				}
				System.out.println();
			}
		}
	}
	
	public String seeAvailableMoves(int row, int col)
	{
		String list = "";
		try
		{
			if(!(board[row][col].getNumber() == "9") && board[row][col].getIsMoveable())
			{
				if(board[row + 1][col] == null) // check if empty space is available to move
				{
					list += "down ";
				}
				if(board[row - 1][col] == null)
				{
					list += "up ";
				}
				if(board[row][col + 1] == null)
				{
					list += "right ";
				}
				if(board[row][col - 1] == null)
				{
					list += "left ";
				}
			}
			else if (board[row][col].getNumber() == "9" && board[row][col].getIsMoveable()) 
			{
			    int upCount = 0, downCount = 0, leftCount = 0, rightCount = 0;
			    // Check downwards
			    while (row + (downCount + 1) < board.length && board[row + (downCount + 1)][col] == null) {
			        downCount++;
			    }
			    list += (downCount + " down ");

			    // Check upwards
			    while (row - (upCount + 1) >= 0 && board[row - (upCount + 1)][col] == null) {
			        upCount++;
			    }
			    list += (upCount + " up ");

			    // Check to the right
			    while (col + (rightCount + 1) < board[0].length && board[row][col + (rightCount + 1)] == null) {
			        rightCount++;
			    }
			    list += (rightCount + " right ");

			    // Check to the left
			    while (col - (leftCount + 1) >= 0 && board[row][col - (leftCount + 1)] == null) {
			        leftCount++;
			    }
			    list += (leftCount + " left ");
			}

		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Row or column index not accessible!");
			System.out.println();
			System.out.println("Please enter another row or column: ");
			row = in.nextInt();
			col = in.nextInt();
			return seeAvailableMoves(row, col);
		}
		if(board[row][col].getIsMoveable() && list == "")
		{
			System.out.println("No moves available!");
			return "";
		}
		else if(!board[row][col].getIsMoveable())
		{
			System.out.println("Piece not moveable!");
			return "";
		}
		else
		{
			return "You can move: " + list;
		}
	}
	
	public void move(int row, int col) {
	    String move = seeAvailableMoves(row, col);
	    System.out.println(move);
	    System.out.println();
	    
	    if(!(board[row][col].getNumber().equals("9") && board[row][col].getIsMoveable())) {
	        System.out.println("Which way would you like to move? ");
	        String direction = in.nextLine();
	        if("down".equals(direction) && move.contains(direction)) {
	            board[row + 1][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("up".equals(direction) && move.contains(direction)) {
	            board[row - 1][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("right".equals(direction) && move.contains(direction)) {
	            board[row][col + 1] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("left".equals(direction) && move.contains(direction)) {
	            board[row][col - 1] = board[row][col];
	            board[row][col] = null;
	        }
	        else {
	            System.out.println("Please enter another row and column: "); // invalid move
	            int newRow = in.nextInt();
	            int newCol = in.nextInt();
	            move(newRow, newCol);
	        }
	    }
	    else if(board[row][col].getNumber().equals("9") && board[row][col].getIsMoveable()) {
	        System.out.println("How many units in what direction would you like to move? ");
	        String direction = in.nextLine();
	        int units = in.nextInt();
	        in.nextLine();
	        if("down".equals(direction) && move.contains(direction)) {
	            board[row + units][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("up".equals(direction) && move.contains(direction)) {
	            board[row - units][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("right".equals(direction) && move.contains(direction)) {
	            board[row][col + units] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("left".equals(direction) && move.contains(direction)) {
	            board[row][col - units] = board[row][col];
	            board[row][col] = null;
	        }
	        else {
	            System.out.println("Please enter another row : "); // invalid move
	            int newRow = in.nextInt();
	            int newCol = in.nextInt();
	            move(newRow, newCol);
	        }
	    }
	    else {
	        System.out.println("Please enter another row and column: ");
	        int newRow = in.nextInt();
	        int newCol = in.nextInt();
	        move(newRow, newCol);
	    }
	}


	public String attack(int row, int col, int otherRow, int otherCol)
	{
		if(board[row][col].getIsMoveable())
		{
			if(board[otherRow][otherCol] != null && (board[row + 1][col] == board[otherRow][otherCol] || (board[row - 1][col] == board[otherRow][otherCol] || (board[row][col + 1] == board[otherRow][otherCol] || (board[row][col - 1] == board[otherRow][otherCol])))))
			{
				if(board[otherRow][otherCol].getNumber() == "Flag")
				{
					return "You win!";
				}
				if(board[row][col].getNumber() == "S" && board[otherRow][otherCol].getNumber() == "1")
				{
					System.out.println("Spy beats marshall!");
					board[otherRow][otherCol].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was successful, take spot
					{
						board[row + 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row - 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col + 1] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col - 1] = board[row][col];
						board[row][col] = null;
					}
				}
				if(board[row][col].getNumber() == "8" && board[otherRow][otherCol].getNumber() == "Bomb")
				{
					System.out.println("Miner defuses the bomb");
					board[otherRow][otherCol].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was successful, take spot
					{
						board[row + 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row - 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col + 1] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col - 1] = board[row][col];
						board[row][col] = null;
					}
				}
				else if(board[otherRow][otherCol].getNumber() == "Bomb")
				{
					System.out.println("Bomb beats " + board[row][col].getClass());
					board[row][col].pieceCount--;
					board[row][col] = null;
				}
				if(board[row][col].getNumber().compareTo(board[otherRow][otherCol].getNumber()) < 0)
				{
					System.out.println(board[row][col].getClass() + " beats " + board[otherRow][otherCol].getClass());
					board[otherRow][otherCol].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was successful, take spot
					{
						board[row + 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row - 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col + 1] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col - 1] = board[row][col];
						board[row][col] = null;
					}
				}
				else if(board[row][col].getNumber().compareTo(board[otherRow][otherCol].getNumber()) > 0)
				{
					System.out.println(board[otherRow][otherCol].getClass() + " beats " + board[row][col].getClass() );
					board[row][col].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was unsuccessful, lose spot
					{
						board[row][col] = board[row + 1][col];
						board[row + 1][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row][col] = board[row - 1][col];
						board[row - 1][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col] = board[row][col + 1];
						board[row][col + 1] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col] = board[row][col - 1];
						board[row][col - 1] = null;
					}
				}
				else
				{
					board[row][col].pieceCount--; // same number
					board[otherRow][otherCol].pieceCount--;
					board[row][col] = null;
					board[otherRow][otherCol] = null;
				}
			}
		}
		else
		{
			System.out.println("This piece cannot attack! Please enter another valid move!");
		}
		return "";
	}
}
=======
package game; import java.util.Random; import java.util.Scanner;

public class Board 
{
	private static final String ANSI_RESET = "\u001B[0m"; 
    private static final String ANSI_RED = "\u001B[31m"; 
    private static final String ANSI_BLUE = "\u001B[34m";
    
	public gamePiece [][] board = new gamePiece[10][10];
	Random index = new Random();
	Scanner in = new Scanner(System.in);
	
	public Board() 
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				board[i][j] = null;
			}
		}
	}

	void setMarshall()
	{
		Marshal marshall = new Marshal(); 
		marshall.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != marshall.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = marshall;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Marshal bmarshall = new Marshal(); 
		bmarshall.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bmarshall.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = bmarshall;
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setGeneral()
	{
		General general = new General();
		general.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != general.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = general;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		General bgeneral = new General();
		bgeneral.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bgeneral.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = bgeneral;
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setColonel()
	{
		Colonel colonel1 = new Colonel();
		Colonel colonel2 = new Colonel();
		colonel1.setColor("red");
		colonel2.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != colonel1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = colonel1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = colonel2;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Colonel bcolonel1 = new Colonel();
		Colonel bcolonel2 = new Colonel();
		bcolonel1.setColor("blue");
		bcolonel2.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bcolonel1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bcolonel1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bcolonel2;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setMajor()
	{
		Major major1 = new Major();
		Major major2 = new Major();
		Major major3 = new Major();
		major1.setColor("red");
		major2.setColor("red");
		major3.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != major1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = major1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = major2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = major3;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Major bmajor1 = new Major();
		Major bmajor2 = new Major();
		Major bmajor3 = new Major();
		bmajor1.setColor("blue");
		bmajor2.setColor("blue");
		bmajor3.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bmajor1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bmajor1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bmajor2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bmajor3;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setCaptain()
	{
		Captain captain1 = new Captain();
		Captain captain2 = new Captain();
		Captain captain3 = new Captain();
		Captain captain4 = new Captain();
		captain1.setColor("red");
		captain2.setColor("red");
		captain3.setColor("red");
		captain4.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != captain1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = captain1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = captain2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = captain3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = captain4;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Captain bcaptain1 = new Captain();
		Captain bcaptain2 = new Captain();
		Captain bcaptain3 = new Captain();
		Captain bcaptain4 = new Captain();
		bcaptain1.setColor("blue");
		bcaptain2.setColor("blue");
		bcaptain3.setColor("blue");
		bcaptain4.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bcaptain1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bcaptain1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bcaptain2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bcaptain3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bcaptain4;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setLieutenant()
	{
		Lieutenant lieutenant1 = new Lieutenant();
		Lieutenant lieutenant2 = new Lieutenant();
		Lieutenant lieutenant3 = new Lieutenant();
		Lieutenant lieutenant4 = new Lieutenant();
		lieutenant1.setColor("red");
		lieutenant2.setColor("red");
		lieutenant3.setColor("red");
		lieutenant4.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != lieutenant1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = lieutenant1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = lieutenant2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = lieutenant3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = lieutenant4;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Lieutenant blieutenant1 = new Lieutenant();
		Lieutenant blieutenant2 = new Lieutenant();
		Lieutenant blieutenant3 = new Lieutenant();
		Lieutenant blieutenant4 = new Lieutenant();
		blieutenant1.setColor("blue");
		blieutenant2.setColor("blue");
		blieutenant3.setColor("blue");
		blieutenant4.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != blieutenant1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = blieutenant1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = blieutenant2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = blieutenant3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = blieutenant4;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setSergeant()
	{
		Sergeant sergeant1 = new Sergeant();
		Sergeant sergeant2 = new Sergeant();
		Sergeant sergeant3 = new Sergeant();
		Sergeant sergeant4 = new Sergeant();
		sergeant1.setColor("red");
		sergeant2.setColor("red");
		sergeant3.setColor("red");
		sergeant4.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != sergeant1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = sergeant1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = sergeant2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = sergeant3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = sergeant4;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Sergeant bsergeant1 = new Sergeant();
		Sergeant bsergeant2 = new Sergeant();
		Sergeant bsergeant3 = new Sergeant();
		Sergeant bsergeant4 = new Sergeant();
		bsergeant1.setColor("blue");
		bsergeant2.setColor("blue");
		bsergeant3.setColor("blue");
		bsergeant4.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bsergeant1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bsergeant1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bsergeant2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bsergeant3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bsergeant4;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setMiner()
	{
		Miner miner1 = new Miner();
		Miner miner2 = new Miner();
		Miner miner3 = new Miner();
		Miner miner4 = new Miner();
		Miner miner5 = new Miner();
		miner1.setColor("red");
		miner2.setColor("red");
		miner3.setColor("red");
		miner4.setColor("red");
		miner5.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != miner1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = miner1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = miner2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = miner3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = miner4;
				}
				else if(count == 4)
				{
					board[rowIndex][colIndex] = miner5;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Miner bminer1 = new Miner();
		Miner bminer2 = new Miner();
		Miner bminer3 = new Miner();
		Miner bminer4 = new Miner();
		Miner bminer5 = new Miner();
		bminer1.setColor("blue");
		bminer2.setColor("blue");
		bminer3.setColor("blue");
		bminer4.setColor("blue");
		bminer5.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bminer1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bminer1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bminer2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bminer3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bminer4;
				}
				else if(bcount == 4)
				{
					board[browIndex][bcolIndex] = bminer5;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setScout()
	{
		Scout scout1 = new Scout();
		Scout scout2 = new Scout();
		Scout scout3 = new Scout();
		Scout scout4 = new Scout();
		Scout scout5 = new Scout();
		Scout scout6 = new Scout();
		Scout scout7 = new Scout();
		Scout scout8 = new Scout();
		scout1.setColor("red");
		scout2.setColor("red");
		scout3.setColor("red");
		scout4.setColor("red");
		scout5.setColor("red");
		scout6.setColor("red");
		scout7.setColor("red");
		scout8.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != scout1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = scout1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = scout2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = scout3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = scout4;
				}
				else if(count == 4)
				{
					board[rowIndex][colIndex] = scout5;
				}
				else if(count == 5)
				{
					board[rowIndex][colIndex] = scout6;
				}
				else if(count == 6)
				{
					board[rowIndex][colIndex] = scout7;
				}
				else if(count == 7)
				{
					board[rowIndex][colIndex] = scout8;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Scout bscout1 = new Scout();
		Scout bscout2 = new Scout();
		Scout bscout3 = new Scout();
		Scout bscout4 = new Scout();
		Scout bscout5 = new Scout();
		Scout bscout6 = new Scout();
		Scout bscout7 = new Scout();
		Scout bscout8 = new Scout();
		bscout1.setColor("blue");
		bscout2.setColor("blue");
		bscout3.setColor("blue");
		bscout4.setColor("blue");
		bscout5.setColor("blue");
		bscout6.setColor("blue");
		bscout7.setColor("blue");
		bscout8.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bscout1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bscout1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bscout2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bscout3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bscout4;
				}
				else if(bcount == 4)
				{
					board[browIndex][bcolIndex] = bscout5;
				}
				else if(bcount == 5)
				{
					board[browIndex][bcolIndex] = bscout6;
				}
				else if(bcount == 6)
				{
					board[browIndex][bcolIndex] = bscout7;
				}
				else if(bcount == 7)
				{
					board[browIndex][bcolIndex] = bscout8;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setSpy()
	{
		Spy spy = new Spy();
		spy.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != spy.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = spy;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Spy bspy = new Spy();
		bspy.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bspy.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = bspy;
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setBomb()
	{
		Bomb bomb1 = new Bomb();
		Bomb bomb2 = new Bomb();
		Bomb bomb3 = new Bomb();
		Bomb bomb4 = new Bomb();
		Bomb bomb5 = new Bomb();
		Bomb bomb6 = new Bomb();
		bomb1.setColor("red");
		bomb2.setColor("red");
		bomb3.setColor("red");
		bomb4.setColor("red");
		bomb5.setColor("red");
		bomb6.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != bomb1.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				if(count == 0)
				{
					board[rowIndex][colIndex] = bomb1;
				}
				else if(count == 1)
				{
					board[rowIndex][colIndex] = bomb2;
				}
				else if(count == 2)
				{
					board[rowIndex][colIndex] = bomb3;
				}
				else if(count == 3)
				{
					board[rowIndex][colIndex] = bomb4;
				}
				else if(count == 4)
				{
					board[rowIndex][colIndex] = bomb5;
				}
				else if(count == 5)
				{
					board[rowIndex][colIndex] = bomb6;
				}
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Bomb bbomb1 = new Bomb();
		Bomb bbomb2 = new Bomb();
		Bomb bbomb3 = new Bomb();
		Bomb bbomb4 = new Bomb();
		Bomb bbomb5 = new Bomb();
		Bomb bbomb6 = new Bomb();
		bbomb1.setColor("blue");
		bbomb2.setColor("blue");
		bbomb3.setColor("blue");
		bbomb4.setColor("blue");
		bbomb5.setColor("blue");
		bbomb6.setColor("blue");
		int bcount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(bcount != bbomb1.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				if(bcount == 0)
				{
					board[browIndex][bcolIndex] = bbomb1;
				}
				else if(bcount == 1)
				{
					board[browIndex][bcolIndex] = bbomb2;
				}
				else if(bcount == 2)
				{
					board[browIndex][bcolIndex] = bbomb3;
				}
				else if(bcount == 3)
				{
					board[browIndex][bcolIndex] = bbomb4;
				}
				else if(bcount == 4)
				{
					board[browIndex][bcolIndex] = bbomb5;
				}
				else if(bcount == 5)
				{
					board[browIndex][bcolIndex] = bbomb6;
				}
				bcount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void setFlag()
	{
		Flag redFlag = new Flag();
		redFlag.setColor("red");
		int count = 0;
		int rowIndex = index.nextInt(4);
		int colIndex = index.nextInt(10);
		while(count != redFlag.getPieceCount())
		{
			if(board[rowIndex][colIndex] == null)
			{
				board[rowIndex][colIndex] = redFlag;
				count++;
			}
			else
			{
				rowIndex = index.nextInt(4);
				colIndex = index.nextInt(10);
			}
		}
		Flag blueFlag = new Flag();
		blueFlag.setColor("blue");
		int blueCount = 0;
		int browIndex = 6 + index.nextInt(4);
		int bcolIndex = index.nextInt(10);
		while(blueCount != blueFlag.getPieceCount())
		{
			if(board[browIndex][bcolIndex] == null)
			{
				board[browIndex][bcolIndex] = blueFlag;
				blueCount++;
			}
			else
			{
				browIndex = 6 + index.nextInt(4);
				bcolIndex = index.nextInt(10);
			}
		}
	}
	
	void generateBoard()
	{
		setMarshall();
		setGeneral();
		setColonel();
		setMajor();
		setCaptain();
		setLieutenant();
		setSergeant();
		setMiner();
		setScout();
		setSpy();
		setBomb();
		setFlag();
		board[4][2] = null;
		board[4][3] = null;
		board[5][2] = null;
		board[5][3] = null;
		board[4][6] = null;
		board[4][7] = null;
		board[5][6] = null;
		board[5][7] = null;
	}
	
	void seeBoard(int turn, boolean color)
	{
		gamePiece [][] redArray = new gamePiece[10][10];
		gamePiece [][] blueArray = new gamePiece[10][10];
		if(turn % 2 == 0 && color) // player 1s turn and red
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 redArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(redArray[i][j] != null && redArray[i][j].getColor() == "blue")
					{
						redArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(redArray[i][j] != null)
					{
						if(redArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_BLUE + "  " + redArray[i][j].getNumber() + "  " + ANSI_RESET);
						}
						else
						{
							System.out.print(ANSI_RED + "  " + redArray[i][j].getNumber() + "  " + ANSI_RESET);
						}
					}
					else
					{
						System.out.print("  " + redArray[i][j] + "  ");
					}
				}
				System.out.println();
			}
		}
		else if(turn % 2 == 0 && !color) // player 1 turn and blue
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 blueArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null && blueArray[i][j].getColor() == "red")
					{
						blueArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null)
					{
						if(blueArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_RED + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
						}
						else
						{
							if(blueArray[i][j] == null)
							{
								System.out.print(ANSI_BLUE + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
							else
							{
								System.out.print(ANSI_BLUE + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
						}
					}
					else
					{
						if(blueArray[i][j] == null)
						{
							System.out.print(blueArray[i][j] + " "); // print board after omission
						}
						else
						{
							System.out.print(" " + blueArray[i][j] + " "); // print board after omission
						}
					}
				}
				System.out.println();
			}
		}
		else if(turn % 2 == 1 && color) // player 2 turn and red
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 redArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(redArray[i][j] != null && redArray[i][j].getColor() == "blue")
					{
						redArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null)
					{
						if(blueArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_BLUE + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
						}
						else
						{
							if(blueArray[i][j] == null)
							{
								System.out.print(ANSI_RED + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
							else
							{
								System.out.print(ANSI_RED + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
						}
					}
					else
					{
						if(blueArray[i][j] == null)
						{
							System.out.print(blueArray[i][j] + " "); // print board after omission
						}
						else
						{
							System.out.print(" " + blueArray[i][j] + " "); // print board after omission
						}
					}
				}
				System.out.println();
			}
		}
		else
		{
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					 blueArray[i][j] = board[i][j]; // copy board
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null && blueArray[i][j].getColor() == "red")
					{
						blueArray[i][j].setNumber("X"); // omit enemy pieces
					}
				}
			}
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					if(blueArray[i][j] != null)
					{
						if(blueArray[i][j].getNumber() == "X")
						{
							System.out.print(ANSI_RED + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
						}
						else
						{
							if(blueArray[i][j] == null)
							{
								System.out.print(ANSI_BLUE + blueArray[i][j].getNumber() + " " + ANSI_RESET); // space nulls to align with pieces

							}
							else
							{
								System.out.print(ANSI_BLUE + " " + blueArray[i][j].getNumber() + " " + ANSI_RESET);
							}
						}
					}
					else
					{
						if(blueArray[i][j] == null)
						{
							System.out.print(blueArray[i][j] + " "); // print board after omission
						}
						else
						{
							System.out.print(" " + blueArray[i][j] + " "); // print board after omission
						}
					}
				}
				System.out.println();
			}
		}
	}
	
	public String seeAvailableMoves(int row, int col)
	{
		String list = "";
		try
		{
			if(!(board[row][col].getNumber() == "9") && board[row][col].getIsMoveable())
			{
				if(board[row + 1][col] == null) // check if empty space is available to move
				{
					list += "down ";
				}
				if(board[row - 1][col] == null)
				{
					list += "up ";
				}
				if(board[row][col + 1] == null)
				{
					list += "right ";
				}
				if(board[row][col - 1] == null)
				{
					list += "left ";
				}
			}
			else if (board[row][col].getNumber() == "9" && board[row][col].getIsMoveable()) 
			{
			    int upCount = 0, downCount = 0, leftCount = 0, rightCount = 0;
			    // Check downwards
			    while (row + (downCount + 1) < board.length && board[row + (downCount + 1)][col] == null) {
			        downCount++;
			    }
			    list += (downCount + " down ");

			    // Check upwards
			    while (row - (upCount + 1) >= 0 && board[row - (upCount + 1)][col] == null) {
			        upCount++;
			    }
			    list += (upCount + " up ");

			    // Check to the right
			    while (col + (rightCount + 1) < board[0].length && board[row][col + (rightCount + 1)] == null) {
			        rightCount++;
			    }
			    list += (rightCount + " right ");

			    // Check to the left
			    while (col - (leftCount + 1) >= 0 && board[row][col - (leftCount + 1)] == null) {
			        leftCount++;
			    }
			    list += (leftCount + " left ");
			}

		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Row or column index not accessible!");
			System.out.println();
			System.out.println("Please enter another row or column: ");
			row = in.nextInt();
			col = in.nextInt();
			return seeAvailableMoves(row, col);
		}
		if(board[row][col].getIsMoveable() && list == "")
		{
			System.out.println("No moves available!");
			return "";
		}
		else if(!board[row][col].getIsMoveable())
		{
			System.out.println("Piece not moveable!");
			return "";
		}
		else
		{
			return "You can move: " + list;
		}
	}
	
	public void move(int row, int col) {
	    String move = seeAvailableMoves(row, col);
	    System.out.println(move);
	    System.out.println();
	    
	    if(!(board[row][col].getNumber().equals("9") && board[row][col].getIsMoveable())) {
	        System.out.println("Which way would you like to move? ");
	        String direction = in.nextLine();
	        if("down".equals(direction) && move.contains(direction)) {
	            board[row + 1][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("up".equals(direction) && move.contains(direction)) {
	            board[row - 1][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("right".equals(direction) && move.contains(direction)) {
	            board[row][col + 1] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("left".equals(direction) && move.contains(direction)) {
	            board[row][col - 1] = board[row][col];
	            board[row][col] = null;
	        }
	        else {
	            System.out.println("Please enter another row and column: "); // invalid move
	            int newRow = in.nextInt();
	            int newCol = in.nextInt();
	            move(newRow, newCol);
	        }
	    }
	    else if(board[row][col].getNumber().equals("9") && board[row][col].getIsMoveable()) {
	        System.out.println("How many units in what direction would you like to move? ");
	        String direction = in.nextLine();
	        int units = in.nextInt();
	        in.nextLine();
	        if("down".equals(direction) && move.contains(direction)) {
	            board[row + units][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("up".equals(direction) && move.contains(direction)) {
	            board[row - units][col] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("right".equals(direction) && move.contains(direction)) {
	            board[row][col + units] = board[row][col];
	            board[row][col] = null;
	        }
	        else if("left".equals(direction) && move.contains(direction)) {
	            board[row][col - units] = board[row][col];
	            board[row][col] = null;
	        }
	        else {
	            System.out.println("Please enter another row : "); // invalid move
	            int newRow = in.nextInt();
	            int newCol = in.nextInt();
	            move(newRow, newCol);
	        }
	    }
	    else {
	        System.out.println("Please enter another row and column: ");
	        int newRow = in.nextInt();
	        int newCol = in.nextInt();
	        move(newRow, newCol);
	    }
	}


	public String attack(int row, int col, int otherRow, int otherCol)
	{
		if(board[row][col].getIsMoveable())
		{
			if(board[otherRow][otherCol] != null && (board[row + 1][col] == board[otherRow][otherCol] || (board[row - 1][col] == board[otherRow][otherCol] || (board[row][col + 1] == board[otherRow][otherCol] || (board[row][col - 1] == board[otherRow][otherCol])))))
			{
				if(board[otherRow][otherCol].getNumber() == "Flag")
				{
					return "You win!";
				}
				if(board[row][col].getNumber() == "S" && board[otherRow][otherCol].getNumber() == "1")
				{
					System.out.println("Spy beats marshall!");
					board[otherRow][otherCol].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was successful, take spot
					{
						board[row + 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row - 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col + 1] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col - 1] = board[row][col];
						board[row][col] = null;
					}
				}
				if(board[row][col].getNumber() == "8" && board[otherRow][otherCol].getNumber() == "Bomb")
				{
					System.out.println("Miner defuses the bomb");
					board[otherRow][otherCol].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was successful, take spot
					{
						board[row + 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row - 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col + 1] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col - 1] = board[row][col];
						board[row][col] = null;
					}
				}
				else if(board[otherRow][otherCol].getNumber() == "Bomb")
				{
					System.out.println("Bomb beats " + board[row][col].getClass());
					board[row][col].pieceCount--;
					board[row][col] = null;
				}
				if(board[row][col].getNumber().compareTo(board[otherRow][otherCol].getNumber()) < 0)
				{
					System.out.println(board[row][col].getClass() + " beats " + board[otherRow][otherCol].getClass());
					board[otherRow][otherCol].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was successful, take spot
					{
						board[row + 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row - 1][col] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col + 1] = board[row][col];
						board[row][col] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col - 1] = board[row][col];
						board[row][col] = null;
					}
				}
				else if(board[row][col].getNumber().compareTo(board[otherRow][otherCol].getNumber()) > 0)
				{
					System.out.println(board[otherRow][otherCol].getClass() + " beats " + board[row][col].getClass() );
					board[row][col].pieceCount--;
					if(board[row + 1][col] == board[otherRow][otherCol]) // if attack took place above and was unsuccessful, lose spot
					{
						board[row][col] = board[row + 1][col];
						board[row + 1][col] = null;
					}
					else if(board[row - 1][col] == board[otherRow][otherCol]) // if attack took place below and was successful, take spot
					{
						board[row][col] = board[row - 1][col];
						board[row - 1][col] = null;
					}
					else if(board[row][col + 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col] = board[row][col + 1];
						board[row][col + 1] = null;
					}
					else if(board[row][col - 1] == board[otherRow][otherCol]) // if attack took place to the right and was successful, take spot
					{
						board[row][col] = board[row][col - 1];
						board[row][col - 1] = null;
					}
				}
				else
				{
					board[row][col].pieceCount--; // same number
					board[otherRow][otherCol].pieceCount--;
					board[row][col] = null;
					board[otherRow][otherCol] = null;
				}
			}
		}
		else
		{
			System.out.println("This piece cannot attack! Please enter another valid move!");
		}
		return "";
	}
}
>>>>>>> 81e51e53313a844476e2c94f3c5226628ed8e1d4
