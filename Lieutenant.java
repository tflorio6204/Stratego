package game;

public class Lieutenant extends gamePiece
{
	public Lieutenant() 
	{
		super();
		setNumber("6");
		setPieceCount(4);
		setPieceDescription("The lieutenant has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
