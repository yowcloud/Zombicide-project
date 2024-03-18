package weapons;

import java.util.ArrayList;
import java.util.Random;

import zombie.Zombie;

/**
 * La clase Sword extiende la clase Weapon.
 * Representa un arma de tipo Espada con propiedades y métodos específicos.
 */
public class Sword extends Weapon {

    /**
     * Constructor de Sword.
     *
     * @param name               Nombre del arma.
     * @param damage             Daño causado por el arma.
     * @param range              Alcance del arma.
     * @param accuracy           Precisión del arma.
     * @param specialAbilityUses Número de usos de la habilidad especial.
     */
    public Sword(String name, int damage, int range, int accuracy, int specialAbilityUses) {
        super(name, damage, range, accuracy, specialAbilityUses);
    }

    /**
     * Imprime la habilidad especial de la Espada.
     */
    private void specialAbility() {
        System.out.println("Mata 2 zombies aleatorios gratis.");
    }

    /**
     * Realiza un ataque especial que elimina dos zombies aleatorios.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después del ataque especial.
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
     * Genera un índice aleatorio dentro del rango del ArrayList de zombies.
     *
     * @param zombies ArrayList de zombies.
     * @return Índice aleatorio.
     */
    private int randomZombieDelete(ArrayList<Zombie> zombies) {
        Random random = new Random();
        return random.nextInt(zombies.size());
    }
}