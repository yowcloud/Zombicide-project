package zombie;

import java.util.ArrayList;

/**
 * La clase Runner extiende la clase Zombie.
 * Representa un zombie de tipo Corredor con propiedades y métodos específicos.
 */
public class Runner extends Zombie {

    /**
     * Constructor de Runner.
     *
     * @param name           Nombre del zombie.
     * @param health         Salud del zombie.
     * @param maxHealth      Salud máxima del zombie.
     * @param alive          Estado de vida del zombie.
     * @param movementZombie Movimiento del zombie.
     * @param damageZombie   Daño causado por el zombie.
     * @param typeZombie     Tipo de zombie.
     */
    public Runner(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
                  char typeZombie) {
        super(name, health, maxHealth, alive, movementZombie, damageZombie, typeZombie);
    }

    /**
     * Realiza una habilidad especial que elimina a todos los zombies de tipo Corredor aún vivos.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después de la habilidad especial.
     */
    public ArrayList<Zombie> specialAbilityBoomer(ArrayList<Zombie> zombies) {
        int numberElimination = 0;
        int size = countZombiesRunner(zombies);
        for (int pos = 0; pos < size; pos++) {
            if (zombies.get(pos).getTypeZombie() == 'r') {
                zombies.remove(pos);
                numberElimination++;
            }
        }
        System.out.println("Runner has delete " + numberElimination + " Runners");
        return zombies;
    }

    /**
     * Cuenta el número de zombies de tipo Corredor en el ArrayList de zombies.
     *
     * @param zombies ArrayList de zombies.
     * @return Número de zombies de tipo Corredor.
     */
    private int countZombiesRunner(ArrayList<Zombie> zombies) {
        int count = 0;
        for (int pos = 0; pos < zombies.size(); pos++) {
            if (zombies.get(pos).getTypeZombie() == 'r') {
                count++;
            }
        }
        return count;
    }
}