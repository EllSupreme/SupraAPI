package io.supreme.supraapi.interfaces.cosmetiques;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface ICosmetiques {

    void setName(String name);

    String getName();

    void spawn(Location location, Player player);

    void depsawn(Player player);

}
