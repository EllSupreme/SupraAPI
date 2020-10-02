package io.supreme.supraapi.database.connection;

import io.supreme.supraapi.database.config.JedisConfig;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisConnection {

    private JedisPool jedis;

    public void connect(JedisConfig config) {
        if (config.isEnable()) {
            final ClassLoader previous = Thread.currentThread().getContextClassLoader();
            Thread.currentThread().setContextClassLoader(Jedis.class.getClassLoader());
            final JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
            this.jedis = new JedisPool((GenericObjectPoolConfig) jedisPoolConfig, config.getHost(), 6379, 3000, null, 0);
            Thread.currentThread().setContextClassLoader(previous);
            try (Jedis jedisConnector = pool().getResource()) {
                System.out.println("Redis Ready to use");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                System.err.println("Problem connect Redis");
                this.jedis.close();
                this.jedis = null;
            }
        }
    }

    public void disconnect() {
        this.jedis.close();
    }

    public JedisPool pool() {
        return this.jedis;
    }

}
