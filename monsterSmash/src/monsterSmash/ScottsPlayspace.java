package monsterSmash;
import stuff.creatures.*;

public class ScottsPlayspace {
	private boolean battleStop=false;
public void sTest(){
	CreatureList testCreatures = new CreatureList();
	moveList testMoves = new moveList ();
	while(battleStop==false)
	{Weather testWeather = new Weather("rain");
	System.out.println(testWeather.getMultipliers()[0]);
	double attack =1.0*testCreatures.getFireBob().getPhysicalAttackStat()*(1.0*testCreatures.getFireBob().getPhysicalAttackStat()/(1.0*testCreatures.getWaterBuffalo().getPhysicalDefenseStat()));
	double attack2 =1.0*testCreatures.getWaterBuffalo().getPhysicalAttackStat()*(testCreatures.getWaterBuffalo().getPhysicalAttackStat()/(1.0*testCreatures.getFireBob().getPhysicalDefenseStat()));
	System.out.println(attack);
	System.out.println(attack2);
	
	//Check if battle should end
	if (testCreatures.getFireBob().getCurrentHealthStat()<=0)
	{battleStop=true;}
	if (testCreatures.getWaterBuffalo().getCurrentHealthStat()<=0)
	{battleStop=true;}
	
	}//end of while loop

}
	
	}


