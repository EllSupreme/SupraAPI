package io.supreme.supraapi.interfaces.nick;

import org.bukkit.entity.Player;

public interface INick {

    void setPlayerNickName(Player player);

    String getPlayerNickName(Player player);

    void resetPlayerNick(Player player);

}
