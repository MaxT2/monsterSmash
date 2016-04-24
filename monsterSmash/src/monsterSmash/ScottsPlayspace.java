package monsterSmash;

import stuff.creatures.*;

public class ScottsPlayspace {
public void sTest(){
	Weather testWeather = new Weather("rain");
	System.out.println(testWeather.getMultipliers()[0]);
	CreatureList testCreatures = new CreatureList();
	double attack =1.0*testCreatures.getFireBob().getPhysicalAttackStat()*(testCreatures.getFireBob().getPhysicalAttackStat()/(1.0*testCreatures.getWaterBuffalo().getPhysicalDefenseStat()));
	System.out.println(attack);
	

}
	
	}


