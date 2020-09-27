package io.supreme.supraapi.connection;

public class JedisConnection {

    private final String host;
    private final String password;
    private final boolean enable;

    public JedisConnection(final String host, final String password, final boolean enable) {
        this.host = host;
        this.password = password;
        this.enable = enable;
    }

    public String getHost() {
        return this.host;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
