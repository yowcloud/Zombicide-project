package weapons;

import java.util.ArrayList;
import zombie.Zombie;

/**
 * Spell class extends the Weapon class.
 * It represents a weapon of type Spell with specific properties and methods.
 */
public class Spell extends Weapon {

 /**
  * Spell constructor.
  * @param name Name of the weapon.
  * @param damage Damage caused by the weapon.
  * @param range Range of the weapon.
  * @param accuracy Accuracy of the weapon.
  * @param specialAbilityUses Number of uses of the special ability.
  */
 public Spell(String name, int damage, int range, int accuracy, int specialAbilityUses) {
  super(name, damage, range, accuracy, specialAbilityUses);
 }

 /**
  * Prints the special ability of the Spell.
  */
 public void specialAbility() {
  System.out.println("Kill 2 walkers for free.");
 }

 /**
  * Performs a special attack that deletes zombies of type Walker.
  * @param zombies ArrayList of zombies.
  * @return ArrayList of zombies after the special attack.
  */
 public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {
  int count = 0;

  for (int pos = 0; pos < zombies.size() && count <= 1; pos++) {
   if (zombies.get(pos).getTypeZombie() == 'w') {
    zombies.remove(pos);
    count++;
   }
  }

  return zombies;
 }
}