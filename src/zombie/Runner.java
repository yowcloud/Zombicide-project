package zombie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Runner extends Zombie {

	public Runner(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
			char typeZombie) {
		super(name, health, maxHealth, alive, movementZombie, damageZombie, typeZombie);

	}

	public void runnerSound() {
		System.out.println("The runner says: ruuun ruun");
	}

	// habilidad especial le permite eliminar a todos los corredores aún vivos.
	public ArrayList<Zombie> specialAbilityBoomer(ArrayList<Zombie> zombies) {
		int numberElimination = 0;
		int size = countZombiesRunner(zombies);
		for (int pos = 0; pos < size; pos++) {
			if (zombies.get(pos).getTypeZombie() == 'r') {
				zombies.remove(pos);
				numberElimination++;
			}
		}
		System.out.println("Runner has delete " + numberElimination + " Runners");
		return zombies;
	}

	private int countZombiesRunner(ArrayList<Zombie> zombies) {
		int count = 0;
		for (int pos = 0; pos < zombies.size(); pos++) {
			if (zombies.get(pos).getTypeZombie() == 'r') {
				count++;
			}
		}
		return count;
	}
}
