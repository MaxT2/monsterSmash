// this is the creature class

package monsterSmash;

public class Creature {
	

	private String name;
	private short healthStat;
	private short physicalAttackStat;
	private short energyAttackStat;
	private short physicalDefenseStat; 
	private short energyDefenseStat;
	private short speedStat; 


	public Creature(){
		
		
	}
	
	public Creature(String tempName,short health, short physAtk, short enAtk, short phyDef, short enDef, short speed ){
		
		this.name = tempName;
		this.healthStat = health;
		this.physicalAttackStat = physAtk;
		this.energyAttackStat = enAtk;
		this.physicalDefenseStat = phyDef;
		this.energyDefenseStat = enDef;
		this.speedStat = speed;
		
	}
	
public short getHealthStat() {
	return healthStat;
}
public void setHealthStat(short healthStat) {
	this.healthStat = healthStat;
}
public short getPhysicalAttackStat() {
	return physicalAttackStat;
}
public void setPhysicalAttackStat(short physicalAttackStat) {
	this.physicalAttackStat = physicalAttackStat;
}
public short getEnergyAttackStat() {
	return energyAttackStat;
}
public void setEnergyAttackStat(short energyAttackStat) {
	this.energyAttackStat = energyAttackStat;
}
public short getPhysicalDefenseStat() {
	return physicalDefenseStat;
}
public void setPhysicalDefenseStat(short physicalDefenseStat) {
	this.physicalDefenseStat = physicalDefenseStat;
}
public short getEnergyDefenseStat() {
	return energyDefenseStat;
}
public void setEnergyDefenseStat(short energyDefenseStat) {
	this.energyDefenseStat = energyDefenseStat;
}
public short getSpeedStat() {
	return speedStat;
}
public void setSpeedStat(short speedStat) {
	this.speedStat = speedStat;
}


// method to return an array of all creature stats
public Short[] getAllStats(){
	
	return new Short[]{healthStat,physicalAttackStat,energyAttackStat,physicalDefenseStat,energyDefenseStat,speedStat };
	
}

// to string method for printing out creature stats

public String toString(){
	return name + "'s stats:\n" + "Health: " + healthStat + "\nPhysical Attack: " + physicalAttackStat + "\nEnergy Attack: " + energyAttackStat + 
			"\nPhysical Defense: " + physicalDefenseStat + "\nEelectttric Defense " + energyDefenseStat + "\n Speed Stat " + speedStat;

	
}


}
