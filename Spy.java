package game;

public class Spy extends gamePiece
{
	public Spy() 
	{
		super();
		setNumber("S");
		setPieceCount(1);
		setPieceDescription("The spy is the only piece (besides another Marshall) that can kill the marshall.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}

}
