package objectmasterpartone;
import objectmasterparttwo.Ninja;
import objectmasterparttwo.Samurai;
import objectmasterparttwo.Wizard;
public class TestHuman {

	public static void main(String[] args) {
		Human bob = new Human();
		Human moe = new Human();
		bob.attack(moe);
		
		Wizard jason = new Wizard();
		Ninja brian = new Ninja();
		Samurai ant = new Samurai();
		
		System.out.println(jason.getHealth());
		System.out.println(brian.getHealth());
		System.out.println(ant.getHealth());

		
		jason.fireball(ant);
		jason.heal(ant);
		
		brian.steal(ant);
		brian.runAway();
		
		ant.meditate();
		ant.deathBlow(jason);
		
		
		System.out.println(jason.getHealth());
		System.out.println(brian.getHealth());
		System.out.println(ant.getHealth());
	}

}
