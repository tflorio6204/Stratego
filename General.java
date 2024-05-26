package game;

public class General extends gamePiece
{
	public General() 
	{
		super();
		setNumber("2");
		setPieceCount(1);
		setPieceDescription("The general has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
