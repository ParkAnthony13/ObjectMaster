package objectmasterpartone;

public class Human {
	private int strength;
	private int intelligence;
	private int stealth;
	private int health;
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
	public void attack(Human otherPerson) {
		System.out.println("You attack, "+otherPerson+" for "+this.strength+" damage");
		otherPerson.health -= this.strength;
	}
	
}
