<<<<<<< HEAD
package game; import java.util.Scanner;

public abstract class gamePiece
{
	public int pieceCount;
	public String number;
	public String color;
	protected String pieceDescription;
	public boolean isMoveable;
	Scanner in = new Scanner(System.in);
	
	public gamePiece() 
	{
		number = "";
		pieceCount = 0;
		pieceDescription = "";
		color = "";
		isMoveable = true;
	}
	
	public void setColor(String type)
	{
		color = type;
	}
	
	public void setNumber(String num)
	{
		number = num;
	}
	
	public void setPieceCount(int count)
	{
		pieceCount = count;
	}
	
	public void setPieceDescription(String description)
	{
		pieceDescription = description;
	}
	
	public void setMoveable(boolean move)
	{
		isMoveable = move;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean getIsMoveable()
	{
		return isMoveable;
	}
	
	public int getPieceCount()
	{
		return pieceCount;
	}
	
	public abstract String getPieceDescription();
}
=======
package game; import java.util.Scanner;

public abstract class gamePiece
{
	public int pieceCount;
	public String number;
	public String color;
	protected String pieceDescription;
	public boolean isMoveable;
	Scanner in = new Scanner(System.in);
	
	public gamePiece() 
	{
		number = "";
		pieceCount = 0;
		pieceDescription = "";
		color = "";
		isMoveable = true;
	}
	
	public void setColor(String type)
	{
		color = type;
	}
	
	public void setNumber(String num)
	{
		number = num;
	}
	
	public void setPieceCount(int count)
	{
		pieceCount = count;
	}
	
	public void setPieceDescription(String description)
	{
		pieceDescription = description;
	}
	
	public void setMoveable(boolean move)
	{
		isMoveable = move;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean getIsMoveable()
	{
		return isMoveable;
	}
	
	public int getPieceCount()
	{
		return pieceCount;
	}
	
	public abstract String getPieceDescription();
}
>>>>>>> 81e51e53313a844476e2c94f3c5226628ed8e1d4
