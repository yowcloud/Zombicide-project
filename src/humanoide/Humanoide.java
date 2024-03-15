package humanoide;

public class Humanoide {
	protected String name;
	protected int health;
	protected int maxHealth;
	protected boolean alive;

	public Humanoide(String name, int health, int maxHealth, boolean alive) {
		setName(name);
		setHealth(health);
		setMaxHealth(maxHealth);
		setAlive(alive);
	}

	public void humanoideSound() {
		System.out.println("The humanoide says: helloo helloo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	public boolean getAlive() {
		return alive;
	}	

	public void setAlive(boolean alive) {
		this.alive = false;
	}

	public String toString() {
		return "Humanoide: name='" + name + "', health=" + health + ", maxHealth=" + maxHealth;
	}

}
