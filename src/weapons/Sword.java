package weapons;

import java.util.ArrayList;
import java.util.Random;
import zombie.Zombie;

/**
 * Sword class extends the Weapon class.
 * It represents a weapon of type Sword with specific properties and methods.
 */
public class Sword extends Weapon {

 /**
  * Sword constructor.
  * @param name Name of the weapon.
  * @param damage Damage caused by the weapon.
  * @param range Range of the weapon.
  * @param accuracy Accuracy of the weapon.
  * @param specialAbilityUses Number of uses of the special ability.
  */
 public Sword(String name, int damage, int range, int accuracy, int specialAbilityUses) {
  super(name, damage, range, accuracy, specialAbilityUses);
 }

 /**
  * Prints the special ability of the Sword.
  */
 private void specialAbility() {
  System.out.println("Kill 2 random zombies for free.");
 }

 /**
  * Performs a special attack that deletes two random zombies.
  * @param zombies ArrayList of zombies.
  * @return ArrayList of zombies after the special attack.
  */
 public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {

  int count = 0;

  while (count < 2 && !zombies.isEmpty()) {
   int randomIndex = randomZombieDelete(zombies);
   zombies.remove(randomIndex);
   count++;
  }
  specialAbility();

  return zombies;
 }

 /**
  * Generates a random index within the range of the zombies ArrayList.
  * @param zombies ArrayList of zombies.
  * @return Random index.
  */
 private int randomZombieDelete(ArrayList<Zombie> zombies) {
  Random random = new Random();
  return random.nextInt(zombies.size());
 }
}