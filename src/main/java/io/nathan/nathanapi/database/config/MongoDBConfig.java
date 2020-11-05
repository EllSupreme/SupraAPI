package io.nathan.nathanapi.database.config;

public class MongoDBConfig {

    private final String host;
    private final String username;
    private final String password;
    private final String database;
    private final int port;
    private final boolean enable;

    /**
     * Config for connect to MangoDB
     * @param host
     * @param port
     * @param username
     * @param password
     * @param database
     * @param enable
     */
    public MongoDBConfig(String host, int port, String username, String password, String database, boolean enable) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.database = database;
        this.enable = enable;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDatabase() {
        return this.database;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
