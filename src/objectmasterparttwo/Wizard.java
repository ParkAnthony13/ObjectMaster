package objectmasterparttwo;
import objectmasterpartone.Human;

public class Wizard extends Human{

	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);		
	}
	public void heal(Human otherPerson) {
		System.out.println("You use Heal on "+otherPerson);
		otherPerson.setHealth(this.getIntelligence());
	}
	public void fireball(Human otherPerson) {
		System.out.println("You cast Fireball on "+otherPerson);
		otherPerson.setHealth(this.getIntelligence()*3);
	}

}
