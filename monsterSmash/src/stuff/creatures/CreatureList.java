// this class defines the current creatures - maybe later it should be a spreedsheet?

package stuff.creatures;

public class CreatureList {
	
	//test creatures
	Creature fireBob;
	Creature waterBuffalo;
	
	
	
	public CreatureList(){
	
	fireBob = new Creature("Fire Bob", 100, 100, 10, 0, 50, 50, 75);
	waterBuffalo = new Creature("Water Buffalo", 100, 100, 15, 0, 30, 30, 85);
	
	}
}
