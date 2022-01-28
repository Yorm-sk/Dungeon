package creature.common;

/**
 * Class contain main characteristics of a creature and give access to them
 */


public abstract class CommonCreature implements CreatureFunctions {
    private int HP;
    private int basicAttack;
    private int armor;
    private int accuracy;
    private int dodge;
    private int critical;

    public CommonCreature(int HP, int basicAttack, int armor, int accuracy, int dodge, int critical) {
        this.HP = HP;
        this.basicAttack = basicAttack;
        this.armor = armor;
        this.accuracy = accuracy;
        this.dodge = dodge;
        this.critical = critical;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }
}
