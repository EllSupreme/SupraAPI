package io.nathan.nathanapi.database.config;

public class SQLConfig {

    private final String host;
    private final int port;
    private final String database;
    private final String username;
    private final String password;
    private final boolean enable;

    /**
     * Config for connect to a SQL server
     * @param host
     * @param port
     * @param database
     * @param username
     * @param password
     * @param enable
     */
    public SQLConfig(String host, int port, String database, String username, String password, boolean enable) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
        this.enable = enable;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public String getDatabase() {
        return this.database;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
