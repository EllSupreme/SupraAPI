package io.supreme.supraapi.interfaces;

import org.bukkit.entity.Player;

public interface Particules {

    public final float PI = 3.14159265358979323846f;

    public abstract void startParticle(Player player);

    public abstract void stopParticle(Player player);

}
