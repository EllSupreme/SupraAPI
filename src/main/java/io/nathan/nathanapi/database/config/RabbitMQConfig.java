package io.nathan.nathanapi.database.config;

public class RabbitMQConfig {

    private final String host;
    private final String username;
    private final String password;
    private final int port;
    private final boolean enable;

    /**
     * Config for connect to RabbitMQ
     * @param host
     * @param port
     * @param username
     * @param password
     * @param enable
     */
    public RabbitMQConfig(String host, int port, String username, String password, boolean enable) {
        this.host = host;
        this.port = port;
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
