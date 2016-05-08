/**
 * 
 */
package monsterSmash;

import java.util.Scanner;

import stuff.creatures.Creature;

/**
 * @author Tristen
 *
 */
public class Player {
	
	String playerName;	
	Creature creatureOne = new Creature();
	Creature creatureTwo = new Creature();
	Creature creatureThree = new Creature();
	Creature creatureFour = new Creature();
	Creature creatureFive = new Creature();
	Creature creatureSix = new Creature();
	Creature creatureArray[] = new Creature[]{creatureOne,creatureTwo,creatureThree,creatureFour,creatureFive,creatureSix};
	Creature activeCreature = creatureArray[0];
	
	public Player(String name){
		playerName = name;
		
		
	}
	
public void printPlayerCreatureList(){
	
	System.out.println("Players creatures are:\n\n");
	System.out.println(creatureOne.toString()+"\n");
	System.out.println(creatureTwo.toString()+"\n");
	System.out.println(creatureThree.toString()+"\n");
	System.out.println(creatureFour.toString()+"\n");
	System.out.println(creatureFive.toString()+"\n");
	System.out.println(creatureSix.toString()+"\n");
}

public String getName(){
	return playerName;
}

public void changeActiveCreature(){
	
	Boolean doneChooseingFlag = false;
	Scanner in = new Scanner(System.in);
	System.out.println("What creature would you like to switch to?");
	
	for (int i = 0;i<6;i++){
		System.out.println(i + " for: " + creatureArray[i]);
	}
	
	while (doneChooseingFlag == false){
		

	int option = in.nextInt();
	if (creatureArray[option].getIsAlive() == true){
			activeCreature = creatureArray[option];
			doneChooseingFlag  = true;
			System.out.println(activeCreature.getName() + " is your new active creature.");
	}
	else if (creatureArray[option].getIsAlive() == false)
		System.out.println("Cannot complete task, that creature is unconscious! Try another creature...");	
	else System.out.println("Invalid option, try again");
	}// end choosing while loop
	}// end of changeActiveCreature
}// end of class
