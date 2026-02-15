package me.Iretemi.capsuleapi;

import me.Iretemi.capsuleapi.capsule.CapsuleAbility;
import me.Iretemi.capsuleapi.color.CapsuleColor;
import org.bukkit.inventory.ItemStack;

public interface CapsuleAPI {

    ItemStack createCapsuleItem(String id, String name, String description, CapsuleColor color, CapsuleAbility ability);

}


