//playspace for me
package monsterSmash;

import java.util.Scanner;

import stuff.creatures.*;

public class TristensPlayspace {
	
	Creature first;
	Boolean inputFlag = false;
	
	public void tTest(){
		CreatureList localCList = new CreatureList();
		
		Player readyPlayerOne = new Player("readyPlayerOne");
		readyPlayerOne.printPlayerCreatureList();
		
		Player readyPlayerTwo = new Player("readyPlayerTwo");
		readyPlayerTwo.printPlayerCreatureList();
		
		
		BattleInstance battle = new BattleInstance(readyPlayerOne,readyPlayerTwo);
		
		first = new Creature("UrMom",10000, 8000,100,100,100,100,100);
		
			
		
		
		
		
		
		
	}// end of tTest

} // end of class
