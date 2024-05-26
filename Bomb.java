package game;

public class Bomb extends gamePiece 
{
	public Bomb() 
	{
		super();
		setNumber("B");
		setPieceCount(6);
		setPieceDescription("Bombs obliterate any enemies besiders miners (cannot move).");
		setMoveable(false);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}

}
