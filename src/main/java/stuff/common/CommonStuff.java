package stuff.common;

/**
 * class contain information about what will every class have
 */
public abstract class CommonStuff {
    private String name;
    private int bonus;

    public CommonStuff(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }
}
