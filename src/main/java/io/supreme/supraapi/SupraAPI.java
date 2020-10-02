package io.supreme.supraapi;

import io.supreme.supraapi.database.config.JedisConfig;
import io.supreme.supraapi.database.config.MongoDBConfig;
import io.supreme.supraapi.database.config.RabbitMQConfig;
import io.supreme.supraapi.database.config.SQLConfig;
import io.supreme.supraapi.database.connection.JedisConnection;
import io.supreme.supraapi.database.connection.MongoDBConnection;
import io.supreme.supraapi.database.connection.RabbitMQConnection;
import io.supreme.supraapi.database.connection.SQLConnection;
import org.bukkit.plugin.java.JavaPlugin;

public class SupraAPI extends JavaPlugin {

    @Override
    public void onLoad() {
        new SQLConnection().connect(new SQLConfig(
                getConfig().getString("sql.host"),
                getConfig().getInt("sql.port"),
                getConfig().getString("sql.database"),
                getConfig().getString("sql.username"),
                getConfig().getString("sql.password"),
                getConfig().getBoolean("sql.enable")
        ));

        new JedisConnection().connect(new JedisConfig(
                getConfig().getString("jedis.host"),
                getConfig().getString("sql.password"),
                getConfig().getBoolean("sql.enable")
        ));

        new MongoDBConnection().connect(new MongoDBConfig(
                getConfig().getString("mongo.host"),
                getConfig().getInt("mongodb.port"),
                getConfig().getString("mongodb.username"),
                getConfig().getString("mongodb.password"),
                getConfig().getString("mongodb.database"),
                getConfig().getBoolean("mongodb.enable")
        ));

        new RabbitMQConnection().connect(new RabbitMQConfig(
                getConfig().getString("rabbitmq.host"),
                getConfig().getInt("rabbitmq.port"),
                getConfig().getString("rabbitmq.username"),
                getConfig().getString("rabbitmq.password"),
                getConfig().getBoolean("rabbitmq.enable")
        ));

        super.onLoad();
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static SupraAPI getPlugin() {
        return getPlugin(SupraAPI.class);
    }


}
