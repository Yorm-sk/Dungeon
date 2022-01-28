package creature.common;

/**
 * interface for main actions of a creature
 */
public interface CreatureFunctions {
    /**
     * Each monster has basic attack
     * @param c1 to change stats of first creature after attack
     * @param c2 to change  stats of second creature after attack
     */
    void basicAttack(CommonCreature c1, CommonCreature c2);
}
