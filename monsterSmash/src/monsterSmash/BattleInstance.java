package monsterSmash;

import java.util.Scanner;

import stuff.creatures.Creature;

//Object to create for each battle

public class BattleInstance {
private Weather condition;
private Boolean endBattleFlag = false;

public BattleInstance(Player one, Player two){
	Scanner in = new Scanner(System.in);
	
	while (endBattleFlag == false){
		System.out.println("What shall we do? \n	1: Attack	2: Run from battle\n");
		int choiseNum =  in.nextInt();
		if (choiseNum == 1)
			this.attack(one.creatureOne,two.creatureOne);
		else if (choiseNum == 2)
			this.endBattle();
		else
		System.out.println("Not an optoin:");		

		
		
		
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