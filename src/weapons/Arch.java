package weapons;

import java.util.ArrayList;

import zombie.Zombie;

/**
 * La clase Arch extiende la clase Weapon.
 * Representa un arma de tipo Arco con propiedades y métodos específicos.
 */
public class Arch extends Weapon {

    /**
     * Constructor de Arch.
     *
     * @param name               Nombre del arma.
     * @param damage             Daño causado por el arma.
     * @param range              Alcance del arma.
     * @param accuracy           Precisión del arma.
     * @param specialAbilityUses Número de usos de la habilidad especial.
     */
    public Arch(String name, int damage, int range, int accuracy, int specialAbilityUses) {
        super(name, damage, range, accuracy, specialAbilityUses);
        setName(name);
        setDamage(damage);
        setRange(range);
        setAccuracy(accuracy);
    }

    /**
     * Imprime la habilidad especial del Arco.
     */
    private void specialAbility() {
        System.out.println("Mata 1 corredor gratis.");
    }

    /**
     * Realiza un ataque especial que elimina zombies de tipo Corredor.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después del ataque especial.
     */
    public ArrayList<Zombie> specialAttack(ArrayList<Zombie> zombies) {
        int count = 0;

        for (int pos = 0; pos < zombies.size() && count < 1; pos++) {
            if (zombies.get(pos).getTypeZombie() == 'r') {
                zombies.remove(pos);
                count++;
            }
        }
        specialAbility();

        return zombies;
    }
}