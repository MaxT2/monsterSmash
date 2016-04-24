// this is the creature class

package monsterSmash;

public class Creature {
	

	private String name;
	private int healthStat;
	private int currentHealthStat;
	private int physicalAttackStat;
	private int energyAttackStat;
	private int physicalDefenseStat; 
	private int energyDefenseStat;
	private int speedStat; 


	public Creature(){
		
		
	}
	
	public Creature(String tempName,int health, int physAtk, int enAtk, int phyDef, int enDef, int speed ){
		
		this.name = tempName;
		this.healthStat = health;
		this.physicalAttackStat = physAtk;
		this.energyAttackStat = enAtk;
		this.physicalDefenseStat = phyDef;
		this.energyDefenseStat = enDef;
		this.speedStat = speed;
		
	}
	
public int getHealthStat() {
	return healthStat;
}
public void setHealthStat(int healthStat) {
	this.healthStat = healthStat;
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




// method to return an array of all creature stats
public int[] getAllStats(){
	
	return new int[]{healthStat,physicalAttackStat,energyAttackStat,physicalDefenseStat,energyDefenseStat,speedStat };
	
}

// to string method for printing out creature stats

public String toString(){
	return name + "'s stats:\n" + "Health: " + healthStat + "\nPhysical Attack: " + physicalAttackStat + "\nEnergy Attack: " + energyAttackStat + 
			"\nPhysical Defense: " + physicalDefenseStat + "\nEelectttric Defense " + energyDefenseStat + "\nSpeed Stat " + speedStat;

	
}


}
