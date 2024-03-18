package zombie;

import java.util.ArrayList;

/**
 * La clase Walker extiende la clase Zombie.
 * Representa un zombie de tipo Walker con propiedades y métodos específicos.
 */
public class Walker extends Zombie {

    /**
     * Constructor de Walker.
     *
     * @param name           Nombre del zombie.
     * @param health         Salud del zombie.
     * @param maxHealth      Salud máxima del zombie.
     * @param alive          Indica si el zombie está vivo.
     * @param movementZombie Movimiento del zombie.
     * @param damageZombie   Daño causado por el zombie.
     * @param typeZombie     Tipo de zombie.
     */
    public Walker(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
                  char typeZombie) {
        super(name, health, maxHealth, alive, movementZombie, damageZombie, typeZombie);
    }


    /**
     * Constructor de Walker.
     *
     * @param alive Indica si el zombie está vivo.
     */
    public Walker(boolean alive) {
        super("Walker", 100, 100, alive, 1, 10, 'w');
    }

    /**
     * La habilidad especial del Walker es invocar a tantos caminantes como hay.
     * Duplica la cantidad de caminantes vivos.
     *
     * @param zombies ArrayList de zombies.
     * @return ArrayList de zombies después de invocar a los caminantes.
     */
    public ArrayList<Zombie> specialAbilityZombie(ArrayList<Zombie> zombies) {
        int count = 0;
        int size = countZombiesWalker(zombies);
        for (int pos = 0; pos < size; pos++) {
            if (zombies.get(pos).getTypeZombie() == 'w') {
                zombies.add(new Walker(true));
                count++;
            }
        }
        System.out.println("Walker has invoked " + count + " walkers");
        return zombies;
    }

    /**
     * Cuenta la cantidad de zombies de tipo Walker en el ArrayList.
     *
     * @param zombies ArrayList de zombies.
     * @return Cantidad de zombies de tipo Walker.
     */
    private int countZombiesWalker(ArrayList<Zombie> zombies) {
        int count = 0;
        for (int pos = 0; pos < zombies.size(); pos++) {
            if (zombies.get(pos).getTypeZombie() == 'w') {
                count++;
            }
        }
        return count;
    }

}