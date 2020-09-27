package io.supreme.supraapi.interfaces.cosmetiques;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Cosmetiques {

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void spawn(Location location, Player player);

    public abstract void depsawn(Player player);



}
