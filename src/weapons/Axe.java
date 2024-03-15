package weapons;

import java.util.ArrayList;
import zombie.Zombie;

/**
 * Axe class extends the Weapon class.
 * It represents a weapon of type Axe with specific properties and methods.
 */
public class Axe extends Weapon {

 /**
  * Axe constructor.
  * @param name Name of the weapon.
  * @param damage Damage caused by the weapon.
  * @param range Range of the weapon.
  * @param accuracy Accuracy of the weapon.
  * @param specialAbilityUses Number of uses of the special ability.
  */
 public Axe(String name, int damage, int range, int accuracy, int specialAbilityUses) {
  super(name, damage, range, accuracy, specialAbilityUses);
 }

 /**
  * Prints the special ability of the Axe.
  */
 private void specialAbility() {
  System.out.println("Free kill 1 Boomer.");
 }

 /**
  * Performs a special attack that deletes zombies of type Boomer.
  * @param zombies ArrayList of zombies.
  * @return ArrayList of zombies after the special attack.
  */
 public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {
  int count = 0;

  for (int pos = 0; pos < zombies.size() && count <= 1; pos++) {
   if (zombies.get(pos).getTypeZombie() == 'b') {
    zombies.remove(pos);
    count++;
   }
  }
  specialAbility();

  return zombies;
 }
}