package me.Iretemi.capsuleapi;

import me.Iretemi.capsuleapi.capsule.Capsule;
import me.Iretemi.capsuleapi.capsule.CapsuleAbility;
import me.Iretemi.capsuleapi.color.CapsuleColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public interface CapsuleAPI {

    ItemStack createCapsuleItem(String id, String name, String description, Material material, CapsuleColor color, CapsuleAbility ability);


    ItemStack toItemStack(Capsule capsule, Material material);

    void registerCapsule(Capsule capsule);

    Capsule getCapsuleById(String id);

}


