package game;

public class Colonel extends gamePiece 
{
	public Colonel() 
	{
		super();
		setNumber("3");
		setPieceCount(2);
		setPieceDescription("The colonel has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
