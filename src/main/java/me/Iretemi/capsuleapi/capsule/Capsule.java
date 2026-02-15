package me.Iretemi.capsuleapi.capsule;

import me.Iretemi.capsuleapi.color.CapsuleColor;
public interface Capsule {
    String getId();

    String getName();

    CapsuleColor getColor();

    CapsuleAbility getAbility();
}
