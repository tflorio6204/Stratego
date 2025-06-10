package game;

public class Sergeant extends gamePiece
{
	public Sergeant() 
	{
		super();
		setNumber("7");
		setPieceCount(4);
		setPieceDescription("The sergeant has no special abilites.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
