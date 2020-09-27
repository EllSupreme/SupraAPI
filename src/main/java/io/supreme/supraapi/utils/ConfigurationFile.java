package io.supreme.supraapi.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigurationFile {

    private FileConfiguration configuration;

    public ConfigurationFile(FileConfiguration configuration) {
        this.configuration = configuration;
    }

    public FileConfiguration getConfiguration() {
        return configuration;
    }

}
