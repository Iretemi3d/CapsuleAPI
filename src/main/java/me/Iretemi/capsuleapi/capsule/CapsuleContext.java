package me.Iretemi.capsuleapi.capsule;

import java.util.UUID;


public interface CapsuleContext {
    UUID getPlayerId();

    int getActivationTime();
}
