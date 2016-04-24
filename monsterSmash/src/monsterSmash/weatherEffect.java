package monsterSmash;

public class weatherEffect {
private String weather;	
private final int MULTARRAYSIZE=6;
double [] multiplier = new double [MULTARRAYSIZE];

public weatherEffect(String weather, double healthMultiplier, double physicalAttackMultiplier,
		double energyAttackMultiplier, double physicalDefenseMultiplier, double energyDefenseMultiplier,
		double speedMultiplier) {
	multiplier[0]=healthMultiplier;
	multiplier[1]=physicalAttackMultiplier;
	multiplier[2]=energyAttackMultiplier;
	multiplier[3]=physicalDefenseMultiplier;
	multiplier[4]=energyDefenseMultiplier;
	multiplier[5]=speedMultiplier;
}

public String getWeather() {
	return weather;
}

public void setWeather(String weather) {
	this.weather = weather;
}

public double[] getMultiplier() {
	return multiplier;
}

public void setMultiplier(double[] multiplier) {
	this.multiplier = multiplier;
}

public int getMULTARRAYSIZE() {
	return MULTARRAYSIZE;
}



}


