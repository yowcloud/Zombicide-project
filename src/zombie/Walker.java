package zombie;

import java.util.ArrayList;

public class Walker extends Zombie {

	public Walker(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
			char typeZombie) {
		super(name, health, maxHealth, alive, movementZombie, damageZombie, typeZombie);

	}

	public void walkerSound() {
		System.out.println("The walker says: waaal waaalk");
	}

	public Walker(boolean alive) {
		super("Walker", 100, 100, alive, 1, 10, 'w');
	}

	// habilidad especial es la de invocar a tantos caminantes como hay (dobla la
	// cantidad de caminantes vivos).
	public ArrayList<Zombie> specialAbilityZombie(ArrayList<Zombie> zombies) {
		int count = 0;
		int size = countZombiesWalker(zombies);
		for (int pos = 0; pos < size; pos++) {
			if (zombies.get(pos).getTypeZombie() == 'w') {
				zombies.add(new Walker(true));
				count++;
			}
		}
		System.out.println("Walker has invoked " + count + " walkers");
		return zombies;
	}

	private int countZombiesWalker(ArrayList<Zombie> zombies) {
		int count = 0;
		for (int pos = 0; pos < zombies.size(); pos++) {
			if (zombies.get(pos).getTypeZombie() == 'w') {
				count++;
			}
		}
		return count;
	}

}
