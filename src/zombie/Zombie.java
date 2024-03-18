package zombie;

import humanoide.Humanoide;

/**
 * La clase Zombie extiende la clase Humanoide.
 * Representa un zombie con propiedades y métodos específicos.
 */
public class Zombie extends Humanoide {

    protected int movementZombie;
    protected int damageZombie;
    protected char typeZombie;

    /**
     * Constructor de Zombie.
     *
     * @param name           Nombre del zombie.
     * @param health         Salud del zombie.
     * @param maxHealth      Salud máxima del zombie.
     * @param alive          Indica si el zombie está vivo.
     * @param movementZombie Movimiento del zombie.
     * @param damageZombie   Daño causado por el zombie.
     * @param typeZombie     Tipo de zombie.
     */
    public Zombie(String name, int health, int maxHealth, boolean alive, int movementZombie, int damageZombie,
                  char typeZombie) {
        super(name, health, maxHealth, alive);
        setMovementZombie(movementZombie);
        setDamageZombie(damageZombie);
        setTypeZombie(typeZombie);
    }

    // Getter y setters

    /**
     * Obtiene el movimiento del zombie.
     *
     * @return Movimiento del zombie.
     */
    public int getMovementZombie() {
        return movementZombie;
    }

    /**
     * Establece el movimiento del zombie.
     *
     * @param movementZombie Movimiento del zombie.
     */
    public void setMovementZombie(int movementZombie) {
        this.movementZombie = movementZombie;
    }

    /**
     * Obtiene el daño del zombie.
     *
     * @return Daño del zombie.
     */
    public int getDamageZombie() {
        return damageZombie;
    }

    /**
     * Establece el daño del zombie.
     *
     * @param damageZombie Daño del zombie.
     */
    public void setDamageZombie(int damageZombie) {
        this.damageZombie = damageZombie;
    }

    /**
     * Obtiene el tipo de zombie.
     *
     * @return Tipo de zombie.
     */
    public char getTypeZombie() {
        return typeZombie;
    }

    /**
     * Establece el tipo de zombie.
     *
     * @param typeZombie Tipo de zombie.
     */
    public void setTypeZombie(char typeZombie) {
        this.typeZombie = typeZombie;
    }

    /**
     * Devuelve una representación en cadena del objeto Zombie.
     *
     * @return Representación en cadena del Zombie.
     */
    public String toString() {
        return name + " movement = " + movementZombie + ", damage = " + damageZombie + " health= " + health;
    }

}