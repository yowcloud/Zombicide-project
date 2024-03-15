package weapons;

/**
 * Weapon class represents a weapon with specific properties and methods.
 * It is the parent class for all specific weapon types.
 */
public class Weapon {

	protected String name;
	protected int damage;
	protected int range;
	protected int accuracy;
	protected int specialAbilityUses;

	/**
	 * Default constructor for Weapon class.
	 * Sets default values for a weapon of type "Dagger".
	 */
	public Weapon() {
		setName("Dagger");
		setDamage(1);
		setRange(1);
		setAccuracy(4);
		setSpecialAbilityUses(1);
	}

	/**
	 * Prints the special ability of the Weapon.
	 * Default weapon has no special ability.
	 */
	private void specialAbility() {
		System.out.println("No special ability");
	}

	/**
	 * Parameterized constructor for Weapon class.
	 * @param name Name of the weapon.
	 * @param damage Damage caused by the weapon.
	 * @param range Range of the weapon.
	 * @param accuracy Accuracy of the weapon.
	 * @param specialAbilityUses Number of uses of the special ability.
	 */
	public Weapon(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		setName(name);
		setDamage(damage);
		setRange(range);
		setAccuracy(accuracy);
		setSpecialAbilityUses(specialAbilityUses);
	}

	/**
	 * Getter for accuracy.
	 * @return Accuracy of the weapon.
	 */
	public int getAccuracy() {
		return accuracy;
	}

	/**
	 * Setter for accuracy.
	 * @param accuracy Accuracy of the weapon.
	 */
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * Getter for range.
	 * @return Range of the weapon.
	 */
	public int getRange() {
		return range;
	}

	/**
	 * Setter for range.
	 * @param range Range of the weapon.
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * Getter for damage.
	 * @return Damage of the weapon.
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Setter for damage.
	 * @param damage Damage of the weapon.
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	/**
	 * Getter for name.
	 * @return Name of the weapon.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name.
	 * @param name Name of the weapon.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for special ability uses.
	 * @param specialAbilityUses Number of uses of the special ability.
	 */
	public void setSpecialAbilityUses(int specialAbilityUses) {
		this.specialAbilityUses = 0;
	}

	/**
	 * Getter for special ability uses.
	 * @return Number of uses of the special ability.
	 */
	public int getSpecialAbilityUses() {
		return specialAbilityUses;
	}

	/**
	 * Returns a string representation of the Weapon object.
	 * @return String representation of the Weapon.
	 */
	public String toString() {
		return "Name: " + name + ", damage: " + damage + ", range: " + " accuracy: " + accuracy;
	}

}