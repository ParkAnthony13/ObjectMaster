package objectmasterparttwo;
import objectmasterpartone.Human;

public class Samurai extends Human{
	public static int numberOfSamurai = 0;
	private static int numberOfSamuraifn = 0;
	public Samurai() {
		this.setHealth(200);
		numberOfSamurai++;
		numberOfSamuraifn++;
	}
	public void deathBlow(Human otherPerson) {
		otherPerson.setHealth(-otherPerson.getHealth());
		this.setHealth(-getHealth()/2);
	}
	public void meditate() {
		this.setHealth(getHealth()/2);
	}
	public static int howMany() {
		return numberOfSamuraifn;
	}
}
