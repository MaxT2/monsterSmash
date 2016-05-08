package stuff.creatures;

public class Move {
	private String moveName;
	private int moveStrength;
	//private Effect moveEffect  TODO
	private int moveSpeed;
	private double moveAccuracy;
	
	public Move(String name, int strength, int speed, double accuracy)
	{moveName=name;
		moveStrength=strength;
		moveSpeed=speed;
		moveAccuracy=accuracy;
	}
	public String getMoveName() {
		return moveName;
	}
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	public int getMoveStrength() {
		return moveStrength;
	}
	public void setMoveStrength(int moveStrength) {
		this.moveStrength = moveStrength;
	}
	public int getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	public double getMoveAccuracy() {
		return moveAccuracy;
	}
	public void setMoveAccuracy(double moveAccuracy) {
		this.moveAccuracy = moveAccuracy;
	}


}
