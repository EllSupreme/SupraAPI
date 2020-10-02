package io.supreme.supraapi.database.message;

import io.supreme.supraapi.SupraAPI;
import io.supreme.supraapi.database.connection.JedisConnection;
import redis.clients.jedis.Jedis;

public class JedisMessage {

    public void message(String message) {
        new JedisConnection().pool().getResource().publish(SupraAPI.getPlugin().getConfig().getString("channels.message"), message);
    }

}
