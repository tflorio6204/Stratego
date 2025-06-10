<<<<<<< HEAD
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
=======
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
>>>>>>> 81e51e53313a844476e2c94f3c5226628ed8e1d4
