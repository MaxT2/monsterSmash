package monsterSmash;

import java.util.Scanner;

import stuff.creatures.Creature;

//Object to create for each battle

public class BattleInstance {
private Weather condition;
private Boolean endBattleFlag = false;

public BattleInstance(Player active, Player defensive){
	Scanner in = new Scanner(System.in);
	
	while (endBattleFlag == false){
		System.out.println("Welcome to the battle... It is now " + active.getName() + "'s turn");
		System.out.println("What do you want to do?\n	1: Attack			2: End Turn\n	3:Change active creature	4: Run from battle\n");
		int choiseNum;
		
		try {
			choiseNum =  in.nextInt();
			if (choiseNum == 1)
				this.attack(active.creatureOne,defensive.creatureOne);
			else if (choiseNum == 2){
				System.out.println("Player " + active.getName() + "'s turn is over");
				Player temp = active;
				active = defensive;
				defensive = temp;
				
			}
			else if (choiseNum == 3){
				active.changeActiveCreature();
				Player temp = active;
				active = defensive;
				defensive = temp;
				
			}
			else if (choiseNum == 4)
				this.endBattle();
			else
			System.out.println("Not an option:");		

		
		}
		catch (Exception e){
			System.out.println("Invalid data type, please enter an integer");
			
		}
		
		
		
		
		
		
		
	} // end battle while
	
	in.close();
	
	
	
}// end of BattleInstance



public Weather getCondition() {
	return condition;
}

public void setCondition(Weather condition) {
	this.condition = condition;
}



/**
 * @return the endBattleFlag
 */
public Boolean getEndBattleFlag() {
	return endBattleFlag;
}

/**
 * @param endBattleFlag the endBattleFlag to set
 */
public void endBattle() {
	this.endBattleFlag = true;
}

public void attack(Creature a, Creature b){
	
	System.out.println("BattleInstance.attack() called!");
	double attack =(a.getMove1().getMoveStrength())*1.0*a.getPhysicalAttackStat()*(1.0*a.getPhysicalAttackStat()/(1.0*b.getPhysicalDefenseStat()));
	double attack2 =(b.getMove2().getMoveStrength())*1.0*b.getPhysicalAttackStat()*(b.getPhysicalAttackStat()/(1.0*a.getPhysicalDefenseStat()));

}


} // end of BattleInstance class