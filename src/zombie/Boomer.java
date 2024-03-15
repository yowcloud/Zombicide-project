package zombie;

import java.util.ArrayList;

public class Boomer extends Zombie {

	public Boomer(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
			char typeZombie) {
		super(name, health, maxHealth, alive, movementZombie, damageZombie, typeZombie);
	}

	public void boomerSound() {
		System.out.println("The boomer says: grrrr graaaa");
	}

	public Boomer(boolean alive)
	{
		super("Boomer", 1, 2, true, 3, 5, 'b');
	}
	// habilidad especial permite eliminar a otro Boomer cuando muere.
	public ArrayList<Zombie> specialAbilityBoomer(ArrayList<Zombie> zombies) {
		int numberElimination = 0;
		int size = countZombiesBoomer(zombies);
		for (int pos = 0; pos < size && numberElimination < 1; pos++) {
			if (zombies.get(pos).getTypeZombie() == 'b') {
				zombies.remove(pos);
				numberElimination++;
			}
		}
		return zombies;
	}

	private int countZombiesBoomer(ArrayList<Zombie> zombies) {
		int count = 0;
		for (int pos = 0; pos < zombies.size(); pos++) {
			if (zombies.get(pos).getTypeZombie() == 'b') {
				count++;
			}
		}
		return count;
	}
}
