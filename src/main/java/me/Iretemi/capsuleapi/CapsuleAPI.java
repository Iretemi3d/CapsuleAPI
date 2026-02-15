package me.Iretemi.capsuleapi;
import java.util.UUID;
import me.Iretemi.capsuleapi.capsule.Capsule;

public interface CapsuleAPI {

    Capsule getCapsule(UUID playerId);

    void setCapsule(UUID playerId, Capsule capsule);
}


