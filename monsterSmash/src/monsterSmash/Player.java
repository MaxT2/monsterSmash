/**
 * 
 */
package monsterSmash;

import stuff.creatures.Creature;

/**
 * @author Tristen
 *
 */
public class Player {
	
	Creature creatureOne = new Creature();
	Creature creatureTwo = new Creature();
	Creature creatureThree = new Creature();
	Creature creatureFour = new Creature();
	Creature creatureFive = new Creature();
	Creature creatureSix = new Creature();	
	
	
public void printPlayerCreatureList(){
	
	System.out.println("Players creatures are:\n\n");
	System.out.println(creatureOne.toString()+"\n");
	System.out.println(creatureTwo.toString()+"\n");
	System.out.println(creatureThree.toString()+"\n");
	System.out.println(creatureFour.toString()+"\n");
	System.out.println(creatureFive.toString()+"\n");
	System.out.println(creatureSix.toString()+"\n");
}
	

}
