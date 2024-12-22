package Abilities;

public interface Ability {
    void useAbility();

    boolean canUseAbility();

    int getCooldown();

    int getManaCost();
}
