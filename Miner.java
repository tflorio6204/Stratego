package game;

public class Miner extends gamePiece
{
	public Miner() 
	{
		super();
		setNumber("8");
		setPieceCount(5);
		setPieceDescription("The miner can defuse bombs.");
		setMoveable(true);
	}

	@Override
	public String getPieceDescription() 
	{
		return super.pieceDescription;
	}
}
