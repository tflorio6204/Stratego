package game;

public class Marshal extends gamePiece
{
	public Marshal() 
	{
		super();
		setNumber("1");
		setPieceCount(1);
		setPieceDescription("The marshall has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
