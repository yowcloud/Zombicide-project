package weapons;

import java.util.ArrayList;

import zombie.Zombie;

/**
 * La clase Axe extiende la clase Weapon.
 * Representa un arma de tipo Hacha con propiedades y métodos específicos.
 */
public class Axe extends Weapon {

    /**
     * Constructor de Axe.
     *
     * @param name               Nombre del arma.
     * @param damage             Daño causado por el arma.
     * @param range              Alcance del arma.
     * @param accuracy           Precisión del arma.
     * @param specialAbilityUses Número de usos de la habilidad especial.
     */
    public Axe(String name, int damage, int range, int accuracy, int specialAbilityUses) {
        super(name, damage, range, accuracy, specialAbilityUses);
    }

    /**
     * Imprime la habilidad especial del Hacha.
     */
    private void specialAbility() {
        System.out.println("Mata 1 Boomer gratis.");
    }

    /**
     * Realiza un ataque especial que elimina zombies de tipo Boomer.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después del ataque especial.
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