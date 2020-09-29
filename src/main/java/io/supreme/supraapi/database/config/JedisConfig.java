package io.supreme.supraapi.database.config;

public class JedisConfig {

    private final String host;
    private final String password;
    private final boolean enable;

    /**
     * Config for connect to Jedis
     * @param host
     * @param password
     * @param enable
     */
    public JedisConfig(final String host, final String password, final boolean enable) {
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
