package weapons;

import java.util.ArrayList;

import zombie.Zombie;

public class Spell extends Weapon {
	// constructor de Hechizo
	public Spell(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		super(name, damage, range, accuracy, specialAbilityUses);

	}

	public void specialAbility() {
		System.out.println("Kill 2 walkers for free.");
	}

	/* specialAttack */
	public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {
		int count = 0;

		for (int pos = 0; pos < zombies.size() && count <= 1; pos++) {
			if (zombies.get(pos).getTypeZombie() == 'w') {
				zombies.remove(pos);
				count++;
			}
		}

		return zombies;
	}
}
