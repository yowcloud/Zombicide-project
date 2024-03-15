package zombie;

import humanoide.Humanoide;

public class Zombie extends Humanoide {

	protected int movementZombie;
	protected int damageZombie;
	protected char typeZombie;

	public Zombie(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
			char typeZombie) {
		super(name, health, maxHealth, alive);
		setMovementZombie(movementZombie);
		setDamageZombie(damageZombie);
		setTypeZombie(typeZombie);
	}

	// test
	public void zombieSound() {
		System.out.println("The zombie says: aaaa aaaa");
	}
	

	// Getter y setters
	public int getMovementZombie() {
		return movementZombie;
	}

	public void setMovementZombie(int movementZombie) {
		this.movementZombie = movementZombie;
	}

	public int getDamageZombie() {
		return damageZombie;
	}

	public void setDamageZombie(int damageZombie) {
		this.damageZombie = damageZombie;
	}

	public char getTypeZombie() {
		return typeZombie;
	}

	public void setTypeZombie(char typeZombie) {
		this.typeZombie = typeZombie;
	}

	public String toString() {
		return name + " movement = " + movementZombie + ", damage = " + damageZombie + " health= " + health;
	}

}
