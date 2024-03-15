package weapons;

import java.util.ArrayList;
import java.util.Random;

import zombie.Zombie;

public class Sword extends Weapon {

	// Constructor Espada"
	public Sword(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		super(name, damage, range, accuracy, specialAbilityUses);
	}

	private void specialAbility() {
		System.out.println("Kill 2 random zombies for free.");
	}

	/* specialAttack */
	public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {

		int count = 0;

		while (count < 2 && !zombies.isEmpty()) {
			int randomIndex = randomZombieDelete(zombies);
			zombies.remove(randomIndex);
			count++;
		}
		specialAbility();

		return zombies;
	}

	private int randomZombieDelete(ArrayList<Zombie> zombies) {
		Random random = new Random();
		return random.nextInt(zombies.size());
	}
}
