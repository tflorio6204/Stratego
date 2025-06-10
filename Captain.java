package game;

public class Captain extends gamePiece 
{
	public Captain() 
	{
		super();
		setNumber("5");
		setPieceCount(4);
		setPieceDescription("The captain has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
