package game;

public class Major extends gamePiece
{
	public Major() 
	{
		super();
		setNumber("4");
		setPieceCount(3);
		setPieceDescription("The major has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
