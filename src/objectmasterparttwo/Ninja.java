package objectmasterparttwo;
import objectmasterpartone.Human;

public class Ninja extends Human{

	public Ninja() {
		this.setStealth(10);
	}
	public void steal(Human otherPerson) {
		System.out.println("Vampiric Strike");
		otherPerson.setHealth(-this.getStealth());
		this.setHealth(this.getStealth());
	}
	public void runAway() {
		System.out.println("Disengage");
		this.setHealth(-10);
	}
}
