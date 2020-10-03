package io.supreme.supraapi.interfaces.friends;

import org.bukkit.entity.Player;

import java.util.List;

public interface IFriends {

    void addFriend(Player player, Player friend);

    void removeFriend(Player player, Player friend);

    boolean isFriend(Player player, Player friend);

    List<Player> getFriendList(Player player);

}
