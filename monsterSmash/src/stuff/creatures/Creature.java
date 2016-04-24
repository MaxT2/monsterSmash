// this is the creature class

package stuff.creatures;

public class Creature {
	

	private String name;
	private int maxHealthStat;
	private int currentmaxHealthStat;
	private int physicalAttackStat;
	private int energyAttackStat;
	private int physicalDefenseStat; 
	private int energyDefenseStat;
	private int speedStat; 
	private char creatureType;


	
	// -------------------- class methods --------------------
	
	
	/**
	 * Creates creature with given stats:
	 * @param Name
	 * @param Max Health
	 * @param Current Health
	 * @param Physical Attack
	 * @param Energy Attack
	 * @param Physical Defense
	 * @param Energy Defense
	 * @param Speed
	 */
	public Creature(String tempName,int health, int currentHealth, int physAtk, int enAtk, int phyDef, int enDef, int speed ){
		
		this.name = tempName;
		this.maxHealthStat = health;
		this.currentmaxHealthStat =currentHealth;
		this.physicalAttackStat = physAtk;
		this.energyAttackStat = enAtk;
		this.physicalDefenseStat = phyDef;
		this.energyDefenseStat = enDef;
		this.speedStat = speed;
		
	}
	
public int getmaxHealthStat() {
	return maxHealthStat;
}
public void setmaxHealthStat(int maxHealthStat) {
	this.maxHealthStat = maxHealthStat;
}

public int getCurrentmaxHealthStat() {
	return currentmaxHealthStat;
}

public void setCurrentmaxHealthStat(int currentmaxHealthStat) {
	this.currentmaxHealthStat = currentmaxHealthStat;
}

public int getPhysicalAttackStat() {
	return physicalAttackStat;
}
public void setPhysicalAttackStat(int physicalAttackStat) {
	this.physicalAttackStat = physicalAttackStat;
}
public int getEnergyAttackStat() {
	return energyAttackStat;
}
public void setEnergyAttackStat(int energyAttackStat) {
	this.energyAttackStat = energyAttackStat;
}
public int getPhysicalDefenseStat() {
	return physicalDefenseStat;
}
public void setPhysicalDefenseStat(int physicalDefenseStat) {
	this.physicalDefenseStat = physicalDefenseStat;
}
public int getEnergyDefenseStat() {
	return energyDefenseStat;
}
public void setEnergyDefenseStat(int energyDefenseStat) {
	this.energyDefenseStat = energyDefenseStat;
}
public int getSpeedStat() {
	return speedStat;
}
public void setSpeedStat(int speedStat) {
	this.speedStat = speedStat;
}

public char getCreatureType() {
	return creatureType;
}

public void setCreatureType(char creatureType) {
	this.creatureType = creatureType;
}

// method to return an array of all creature stats
public int[] getAllStats(){
	
	return new int[]{maxHealthStat,physicalAttackStat,energyAttackStat,physicalDefenseStat,energyDefenseStat,speedStat };
	
}

// to string method for printing out creature stats

public String toString(){
	return name + "'s stats:\n" + "Health: " + maxHealthStat + "\nPhysical Attack: " + physicalAttackStat + "\nEnergy Attack: " + energyAttackStat + 
			"\nPhysical Defense: " + physicalDefenseStat + "\nEelectttric Defense " + energyDefenseStat + "\nSpeed Stat " + speedStat;

	
}


}
