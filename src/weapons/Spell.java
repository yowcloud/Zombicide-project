package weapons;

import java.util.ArrayList;

import zombie.Zombie;

/**
 * La clase Spell extiende la clase Weapon.
 * Representa un arma de tipo Hechizo con propiedades y métodos específicos.
 */
public class Spell extends Weapon {

    /**
     * Constructor de Spell.
     *
     * @param name               Nombre del arma.
     * @param damage             Daño causado por el arma.
     * @param range              Alcance del arma.
     * @param accuracy           Precisión del arma.
     * @param specialAbilityUses Número de usos de la habilidad especial.
     */
    public Spell(String name, int damage, int range, int accuracy, int specialAbilityUses) {
        super(name, damage, range, accuracy, specialAbilityUses);
    }

    /**
     * Imprime la habilidad especial del Hechizo.
     */
    public void specialAbility() {
        System.out.println("Mata 2 caminantes gratis.");
    }

    /**
     * Realiza un ataque especial que elimina zombies de tipo Caminante.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después del ataque especial.
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