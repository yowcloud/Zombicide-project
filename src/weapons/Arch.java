package weapons;

import java.util.ArrayList;

import zombie.Zombie;

/**
 * Arch class extends the Weapon class.
 * It represents a weapon of type Arch with specific properties and methods.
 */
public class Arch extends Weapon {

	/**
	 * Arch constructor.
	 * @param name Name of the weapon.
	 * @param damage Damage caused by the weapon.
	 * @param range Range of the weapon.
	 * @param accuracy Accuracy of the weapon.
	 * @param specialAbilityUses Number of uses of the special ability.
	 */
	public Arch(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		super(name, damage, range, accuracy, specialAbilityUses);
		setName(name);
		setDamage(damage);
		setRange(range);
		setAccuracy(accuracy);
	}

	/**
	 * Prints the special ability of the Arch.
	 */
	private void specialAbility() {
		System.out.println("Kill 1 runner for free.");
	}

	/**
	 * Performs a special attack that deletes zombies of type Runner.
	 * @param zombies ArrayList of zombies.
	 * @return ArrayList of zombies after the special attack.
	 */
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