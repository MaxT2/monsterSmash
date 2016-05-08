// this is the creature class

package stuff.creatures;
import java.util.Random;

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
	private Move move1;
	private Move move2;
	private Move move3;
	private Move move4;
	private Boolean isAlive = true;


	
	// -------------------- class methods --------------------
	

	public Creature(){
	// creates a creature with random stats	
		Random rand = new Random();
		moveList testMove = new moveList();
		this.name = "Random Creature " + rand.nextInt(10);
		this.maxHealthStat = rand.nextInt(200)+1;
		this.currentHealthStat = maxHealthStat;
		this.physicalAttackStat = rand.nextInt(100)+1;
		this.energyAttackStat = rand.nextInt(100)+1;
		this.physicalDefenseStat = rand.nextInt(50)+1;
		this.energyDefenseStat = rand.nextInt(50)+1;
		this.speedStat = rand.nextInt(99)+1;
		this.move1 = testMove.ram;
		this.move2=testMove.smash;
		this.move3=testMove.tickle;
		this.move4=testMove.wack;

	}	
	
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
public String getName(){
	return name;
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






public Move getMove1() {
	return move1;
}

public void setMove1(Move move1) {
	this.move1 = move1;
}

public Move getMove2() {
	return move2;
}

public void setMove2(Move move2) {
	this.move2 = move2;
}

public Move getMove3() {
	return move3;
}

public void setMove3(Move move3) {
	this.move3 = move3;
}

public Move getMove4() {
	return move4;
}

public void setMove4(Move move4) {
	this.move4 = move4;
}

public Boolean getIsAlive(){
	return isAlive;
}

public void killCreature(){
	isAlive = false;
}

public String toString(){
	return name + "'s stats:\n" + "Health: " + maxHealthStat + "\nPhysical Attack: " + physicalAttackStat + "\nEnergy Attack: " + energyAttackStat + 
			"\nPhysical Defense: " + physicalDefenseStat + "\nEelectttric Defense " + energyDefenseStat + "\nSpeed Stat " + speedStat + "\n\n";

	
}


}
