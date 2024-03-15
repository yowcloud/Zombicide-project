package weapons;

public class Weapon {

	protected String name;
	protected int damage;
	protected int range;
	protected int accuracy;
	protected int specialAbilityUses;

	// Constructor vacío con arma por defecto "Dagger"
	public Weapon() {
		setName("Dagger");
		setDamage(1);
		setRange(1);
		setAccuracy(4);
		setSpecialAbilityUses(1);

	}

	private void specialAbility() {
		System.out.println("No special ability");
	}

	public Weapon(String name, int damage, int range, int accuracy, int specialAbilityUses) {
		setName(name);
		setDamage(damage);
		setRange(range);
		setAccuracy(accuracy);
		setSpecialAbilityUses(specialAbilityUses);
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecialAbilityUses(int specialAbilityUses) {
		this.specialAbilityUses = 0;
	}

	public int getSpecialAbilityUses() {
		return specialAbilityUses;
	}

	public String toString() {
		return "Name: " + name + ", damage: " + damage + ", range: " + " accuracy: " + accuracy;
	}

}
