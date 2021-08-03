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
	public void setStrength(int num) {
		this.strength += num;
	}
	public int getStrength() {
		return this.strength;
	}
	public void setIntelligence(int num) {
		this.intelligence += num;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	public void setStealth(int num) {
		this.stealth += num;
	}
	public int getStealth() {
		return this.stealth;
	}
	public void setHealth(int num) {
		this.health += num;
	}
	public int getHealth() {
		return this.health;
	}
	
}
