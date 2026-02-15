package me.Iretemi.capsuleapi.player;
import java.util.UUID;
import me.Iretemi.capsuleapi.capsule.Capsule;

public interface CapsulePlayer {

    UUID getUniqueId();

    Capsule getCapsule();

}
