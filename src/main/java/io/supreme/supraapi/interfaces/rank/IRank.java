package io.supreme.supraapi.interfaces.rank;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface IRank {

    String getPrefix(Player player);

    ChatColor getRankColor(Player player);

    ChatColor getChatColor(Player player);

    ChatColor getTabListColor(Player player);

}
