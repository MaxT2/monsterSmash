//playspace for me
package monsterSmash;

import java.util.Scanner;

import stuff.creatures.*;

public class TristensPlayspace {
	
	Creature first;
	Boolean inputFlag = false;
	
	public void tTest(){
		CreatureList localCList = new CreatureList();
		BattleInstance battle = new BattleInstance();
		
		Scanner input = new Scanner(System.in);
		first = new Creature("UrMom",10000, 8000,100,100,100,100,100);
		
		
		int in = 0;
		
		while (battle.getEndBattleFlag()==false){
			
		System.out.println("What shall we do? \n	1: Attack	2: Run from battle\n");
		in =  input.nextInt();
		if (in == 1)
			battle.attack(localCList.getFireBob(), first);
		else if (in == 2)
			battle.endBattle();
		else
		System.out.println("Not an optoin:");		
		
	} // end of battle while
		// move attack power, effect, acuracy, speed
		
		
		
		
		
		
		
	}// end of tTest

} // end of class
