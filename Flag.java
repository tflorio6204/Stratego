package game;

public class Flag extends gamePiece
{
	public Flag() 
	{
		super();
		setNumber("F");
		setPieceCount(1);
		setPieceDescription("Winning objective: Capture the enemy's flag and defend your own!");
		setMoveable(false);
	}

	@Override
	public String getPieceDescription() 
	{
		// TODO Auto-generated method stub
		return super.pieceDescription;
	}

}
