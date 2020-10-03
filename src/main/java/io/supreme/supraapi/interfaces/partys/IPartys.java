package io.supreme.supraapi.interfaces.partys;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface IPartys {

    boolean isInParty(Player player);

    List<Player> getPlayersInParty(UUID partyUUID);

    void invite(UUID partyUUID, Player target);

    void remove(UUID partyUUID, Player target);

    Player getLeader(UUID partyUUID);

}
