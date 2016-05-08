package stuff.creatures;

public class moveList {
	
	Move wack;
	Move smash;
	Move tickle;
	Move ram;
	public moveList ()
	{
		wack= new Move("wack",30,20,0.9);
		smash= new Move("smash",40,20,0.9);
		tickle= new Move("tickle",5,20,0.9);
		ram= new Move("ram",50,10,0.9);

	}

}
