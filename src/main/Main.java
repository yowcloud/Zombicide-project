package main;

import java.util.ArrayList;
import java.util.Scanner;

import players.Player;
import weapons.Arch;
import weapons.Axe;
import weapons.Spell;
import weapons.Sword;
import weapons.Weapon;
import zombie.Boomer;
import zombie.Runner;
import zombie.Walker;
import zombie.Zombie;

public class Main {
	protected static ArrayList<Player> players = new ArrayList<Player>();
	protected static ArrayList<Player> selectedPlayers = new ArrayList<Player>();
	protected static ArrayList<Zombie> zombies = new ArrayList<Zombie>();
	private static ArrayList<Weapon> weapons = new ArrayList<Weapon>();

	public static void initCharacters() {
		players.add(new Player("James", 7, 7, true, true, new Weapon("Mandoble", 2, 1, 4, 1)));
		players.add(new Player("Marie", 5, 5, true, true, new Weapon()));
		players.add(new Player("Jaci", 5, 5, true, true, new Weapon()));
	}

	public static void initZombies() {
		zombies.add(new Walker("Walker", 1, 1, true, 2, 1, 'w'));
		zombies.add(new Boomer("Boomer", 1, 1, true, 2, 1, 'b'));
		zombies.add(new Runner("Runner", 1, 1, true, 2, 1, 'r'));
	}

	public static void initObjecs() {
		weapons.add(new Arch("Arco largo", 1, 2, 3, 1));
		weapons.add(new Axe("Hacha doble", 2, 1, 3, 1));
		weapons.add(new Spell("Bola de fuego", 1, 3, 4, 1));
		weapons.add(new Sword("Espada corta", 1, 1, 4, 1));
	}

	public static Weapon getWeapon() {
		int percentageOfGodWeapon = (int) (Math.random() * 100) + 1;
		if (percentageOfGodWeapon > 50) {
			int randomWeapon = (int) (Math.random() * weapons.size()) + 0;
			return weapons.get(randomWeapon);
		} else
			return null;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		initCharacters();
		initZombies();
		initObjecs();

		Scanner scanner = new Scanner(System.in);
		boolean exits = true;
		while (exits) {
			menuGame();
			int optionSelect = scanner.nextInt();
			switch (optionSelect) {
				case 0:
					System.out.println("End game...");
					exits = false;
					break;
				case 1:
					newGame();
					break;
				case 2:
					newCharacter();
					break;
				default:
					System.out.println("* * * Wrong Option. Try again * * *\n");
			}

		}

	}

	private static void menuGame() {
		System.out.println("""
				===== MENU =====
				0 - Exit
				1 - New Game
				2 - New Character
				================
				""");
	}

	public static void newGame() {

		return;
	}

	public static void newCharacter() {
		return;
	}

}
/*
 * Humanoide humanoide = new Humanoide(null, 0, 0, false); Humanoide zombie =
 * new Zombie(null, 0, 0, false, 0, 0, null); Humanoide runner = new
 * Runner(null, 0, 0, false, 0, 0, null); Humanoide walker = new Walker(null, 0,
 * 0, false, 0, 0, null); Humanoide boomer = new Boomer(null, 0, 0, false, 0, 0,
 * null);
 *
 * humanoide.setName("zombie"); humanoide.setHealth(5);
 * humanoide.setMaxHealth(100); humanoide.setAlive(true);
 * System.out.println("El nombre es: "+ humanoide.getName());
 * System.out.println("El nombre es: "+ humanoide.getHealth());
 * System.out.println("El nombre es: "+ humanoide.getMaxHealth());
 * System.out.println("El nombre es: "+ humanoide.getAlive());
 *
 * humanoide.humanoideSound(); ((Zombie) zombie).zombieSound(); ((Runner)
 * runner).runnerSound(); ((Walker) walker).walkerSound(); ((Boomer)
 * boomer).boomerSound();
 */
