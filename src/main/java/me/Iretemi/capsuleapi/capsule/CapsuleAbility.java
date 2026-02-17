package me.Iretemi.capsuleapi.capsule;

import org.bukkit.entity.Player;

public interface CapsuleAbility {
    String getName();

    void activate(Player player, Player target);

    default void onTick(Player player) {}

    default boolean isPassive() { return false; }


    void setAbility(CapsuleAbility ability);
}
