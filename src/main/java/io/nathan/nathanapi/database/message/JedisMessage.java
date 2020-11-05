package io.nathan.nathanapi.database.message;

import io.nathan.nathanapi.NathanAPI;
import io.nathan.nathanapi.database.connection.JedisConnection;

public class JedisMessage {

    public void message(String message) {
        new JedisConnection().pool().getResource().publish(NathanAPI.getPlugin().getConfig().getString("channels.message"), message);
    }

}
