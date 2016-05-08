package monsterSmash;

import stuff.creatures.Creature;

//Object to create for each battle

public class BattleInstance {
private Weather condition;
private Boolean endBattleFlag = false;

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