package weapons;

import java.util.ArrayList;
import zombie.Zombie;

public class Axe extends Weapon {
	// constructor de hacha
	public Axe(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		super(name, damage, range, accuracy, specialAbilityUses);
	}

	private void specialAbility() {
		System.out.println("Free kill 1 Boomer.");
	}

	/* specialAttack */
	public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {
		int count = 0;

		for (int pos = 0; pos < zombies.size() && count <= 1; pos++) {
			if (zombies.get(pos).getTypeZombie() == 'b') {
				zombies.remove(pos);
				count++;
			}
		}
		specialAbility();

		return zombies;
	}
}
