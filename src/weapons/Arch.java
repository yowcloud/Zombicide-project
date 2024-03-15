package weapons;

import java.util.ArrayList;

import zombie.Zombie;

public class Arch extends Weapon {
	// constructor de Arco
	public Arch(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		super(name, damage, range, accuracy, specialAbilityUses);
		setName(name);
		setDamage(damage);
		setRange(range);
		setAccuracy(accuracy);
	}

	private void specialAbility() {
		System.out.println("Kill 1 runner for free.");
	}

	/* specialAttack Arch delete zombies of type Runner */
	public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {
		int count = 0;

		for (int pos = 0; pos < zombies.size() && count < 1; pos++) {
			if (zombies.get(pos).getTypeZombie() == 'r') {
				zombies.remove(pos);
				count++;
			}
		}
		specialAbility();

		return zombies;
	}
}
