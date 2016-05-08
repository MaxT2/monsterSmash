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
}


} // end of BattleInstance class