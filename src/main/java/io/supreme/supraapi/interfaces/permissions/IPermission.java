package io.supreme.supraapi.interfaces.permissions;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface IPermission {

    boolean hasPermission(Player player, String perm);

    void addPermission(Player player, String perm);

    void removePermission(Player player, String perm);

}
