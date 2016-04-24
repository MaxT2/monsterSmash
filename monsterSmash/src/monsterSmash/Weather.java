package monsterSmash;

public class Weather {
private String condition;
public Weather(String condition){
	this.condition=condition;
}

public double[] getMultipliers()
{
	if ("rain"==this.condition) 
	{	weatherEffect rain= new weatherEffect("rain", 2,1,1,1,1,1);
		return rain.getMultiplier();
	}
	
	if ("solarFlare"==this.condition) 
	{
		weatherEffect solarFlare = new weatherEffect("solarFlare", 2,3,5,4,3,1);
		return solarFlare.getMultiplier();
	} 
	
	return null;
	
}



public String getCondition() {
	

	return condition;
}



}
