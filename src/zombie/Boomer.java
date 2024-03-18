package zombie;

import java.util.ArrayList;

/**
 * La clase Boomer extiende la clase Zombie.
 * Representa un zombie de tipo Boomer con propiedades y métodos específicos.
 */
public class Boomer extends Zombie {

    /**
     * Constructor de Boomer.
     *
     * @param name           Nombre del zombie.
     * @param health         Salud del zombie.
     * @param maxHealth      Salud máxima del zombie.
     * @param alive          Estado de vida del zombie.
     * @param movementZombie Movimiento del zombie.
     * @param damageZombie   Daño causado por el zombie.
     * @param typeZombie     Tipo de zombie.
     */
    public Boomer(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
                  char typeZombie) {
        super(name, health, maxHealth, alive, movementZombie, damageZombie, typeZombie);
    }

    /**
     * Constructor de Boomer.
     *
     * @param alive Estado de vida del zombie.
     */
    public Boomer(boolean alive) {
        super("Boomer", 1, 2, true, 3, 5, 'b');
    }

    /**
     * Realiza una habilidad especial que permite eliminar a otro Boomer cuando muere.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después de la habilidad especial.
     */
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

    /**
     * Cuenta el número de zombies de tipo Boomer en el ArrayList de zombies.
     *
     * @param zombies ArrayList de zombies.
     * @return Número de zombies de tipo Boomer.
     */
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