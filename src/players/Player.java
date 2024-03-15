package players;

import java.util.ArrayList;

import humanoide.Humanoide;
import weapons.Weapon;

public class Player extends Humanoide {
	protected Weapon weapon;
	protected boolean roundPassed;
	protected ArrayList<Weapon> weaponsAvailable;

	public Player(String name, int health, int maxHealth, boolean alive, boolean roundPassed, Weapon weapon) {
		super(name, health, maxHealth, alive);
		setRoundPassed(roundPassed);
		setWeapon(weapon);
		this.weaponsAvailable = new ArrayList<Weapon>();
		this.weaponsAvailable.add(weapon);
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public boolean isRoundPassed() {
		return roundPassed;
	}

	public void setRoundPassed(boolean roundPassed) {
		this.roundPassed = roundPassed;
	}

	public String toString() {
		return name + ", Health=" + health + ", Weapon=" + weapon;
	}
}
