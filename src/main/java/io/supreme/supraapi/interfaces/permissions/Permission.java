package io.supreme.supraapi.interfaces.permissions;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface Permission {

    public abstract boolean hasPermission(Player player, String perm);

    public abstract void addPermission(Player player, String perm);

    public abstract void removePermission(Player player, String perm);

}
