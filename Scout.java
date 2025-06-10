package game;

public class Scout extends gamePiece
{
	public Scout() 
	{
		setNumber("9");
		setPieceCount(8);
		setPieceDescription("Scouts can move more than one space.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
