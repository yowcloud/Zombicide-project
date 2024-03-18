package weapons;

/**
 * La clase Weapon representa un arma con propiedades y métodos específicos.
 * Es la clase padre para todos los tipos de armas específicas.
 */
public class Weapon {

    protected String name;
    protected int damage;
    protected int range;
    protected int accuracy;
    protected int specialAbilityUses;

    /**
     * Constructor por defecto para la clase Weapon.
     * Establece valores por defecto para un arma de tipo "Dagger".
     */
    public Weapon() {
        setName("Dagger");
        setDamage(1);
        setRange(1);
        setAccuracy(4);
        setSpecialAbilityUses(1);
    }

    /**
     * Imprime la habilidad especial del arma.
     * El arma por defecto no tiene habilidad especial.
     */
    private void specialAbility() {
        System.out.println("No special ability");
    }

    /**
     * Constructor parametrizado para la clase Weapon.
     *
     * @param name               Nombre del arma.
     * @param damage             Daño causado por el arma.
     * @param range              Alcance del arma.
     * @param accuracy           Precisión del arma.
     * @param specialAbilityUses Número de usos de la habilidad especial.
     */
    public Weapon(String name, int damage, int range, int accuracy, int specialAbilityUses) {
        setName(name);
        setDamage(damage);
        setRange(range);
        setAccuracy(accuracy);
        setSpecialAbilityUses(specialAbilityUses);
    }

    /**
     * Getter para accuracy.
     *
     * @return Precisión del arma.
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Setter para accuracy.
     *
     * @param accuracy Precisión del arma.
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * Getter para range.
     *
     * @return Alcance del arma.
     */
    public int getRange() {
        return range;
    }

    /**
     * Setter para range.
     *
     * @param range Alcance del arma.
     */
    public void setRange(int range) {
        this.range = range;
    }

    /**
     * Getter para damage.
     *
     * @return Daño del arma.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Setter para damage.
     *
     * @param damage Daño del arma.
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Getter para name.
     *
     * @return Nombre del arma.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter para name.
     *
     * @param name Nombre del arma.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter para specialAbilityUses.
     *
     * @param specialAbilityUses Número de usos de la habilidad especial.
     */
    public void setSpecialAbilityUses(int specialAbilityUses) {
        this.specialAbilityUses = 0;
    }

    /**
     * Getter para specialAbilityUses.
     *
     * @return Número de usos de la habilidad especial.
     */
    public int getSpecialAbilityUses() {
        return specialAbilityUses;
    }

    /**
     * Devuelve una representación en cadena del objeto Weapon.
     *
     * @return Representación en cadena de Weapon.
     */
    public String toString() {
        return "Name: " + name + ", damage: " + damage + ", range: " + " accuracy: " + accuracy;
    }

}