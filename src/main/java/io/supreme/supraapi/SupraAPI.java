package io.supreme.supraapi;

import io.supreme.supraapi.database.config.JedisConfig;
import io.supreme.supraapi.database.config.MangoDBConfig;
import io.supreme.supraapi.database.config.SQLConfig;
import io.supreme.supraapi.database.connection.JedisConnection;
import io.supreme.supraapi.database.connection.MangoDBConnection;
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
                getConfig().getString("sql.host"),
                getConfig().getString("sql.password"),
                getConfig().getBoolean("sql.enable")
        ));

        new MangoDBConnection().connect(new MangoDBConfig(
                getConfig().getString("sql.host"),
                getConfig().getInt("sql.port"),
                getConfig().getString("sql.username"),
                getConfig().getString("sql.password"),
                getConfig().getBoolean("sql.enable")
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
