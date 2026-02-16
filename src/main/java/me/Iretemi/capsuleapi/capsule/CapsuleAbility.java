package me.Iretemi.capsuleapi.capsule;

import org.bukkit.entity.Player;

public interface CapsuleAbility {
    String getName();


    void activate(Player player);

    void setAbility(CapsuleAbility ability);

}
