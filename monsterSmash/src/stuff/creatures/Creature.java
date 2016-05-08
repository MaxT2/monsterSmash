// this is the creature class

package stuff.creatures;

public class Creature {
	

	private String name;
	private int maxHealthStat;
	private int currentHealthStat;
	private int physicalAttackStat;
	private int energyAttackStat;
	private int physicalDefenseStat; 
	private int energyDefenseStat;
	private int speedStat; 
	private char creatureType;
	private String moveName1;
	private String moveName2;
	private String moveName3;
	private String moveName4;


	
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
		this.currentHealthStat =currentHealth;
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

public int getCurrentHealthStat() {
	return currentHealthStat;
}

public void setCurrentHealthStat(int currentHealthStat) {
	this.currentHealthStat = currentHealthStat;
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

public String getMoveName1() {
	return moveName1;
}

public void setMoveName1(String moveName1) {
	this.moveName1 = moveName1;
}

public String getMoveName2() {
	return moveName2;
}

public void setMoveName2(String moveName2) {
	this.moveName2 = moveName2;
}

public String getMoveName3() {
	return moveName3;
}

public void setMoveName3(String moveName3) {
	this.moveName3 = moveName3;
}

public String getMoveName4() {
	return moveName4;
}

public void setMoveName4(String moveName4) {
	this.moveName4 = moveName4;
}

public String toString(){
	return name + "'s stats:\n" + "Health: " + maxHealthStat + "\nPhysical Attack: " + physicalAttackStat + "\nEnergy Attack: " + energyAttackStat + 
			"\nPhysical Defense: " + physicalDefenseStat + "\nEelectttric Defense " + energyDefenseStat + "\nSpeed Stat " + speedStat;

	
}


}
