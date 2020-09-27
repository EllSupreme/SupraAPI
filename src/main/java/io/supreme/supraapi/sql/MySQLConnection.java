package io.supreme.supraapi.sql;

public class MySQLConnection {

    private final String host;
    private final int port;
    private final String database;
    private final String username;
    private final String password;
    private final boolean enable;

    public MySQLConnection(final String host, final int port, final String database, final String username, final String password, final boolean enable) {
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
