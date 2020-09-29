package io.supreme.supraapi.database.connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.supreme.supraapi.database.config.SQLConfig;

public class SQLConnection {

    private HikariDataSource hikariDataSource;

    public void connect(SQLConfig config) {
        if (config.isEnable()) {
            try {
                final HikariConfig hikariConfig = new HikariConfig();
                hikariConfig.setJdbcUrl("jdbc:mysql://" + config.getHost() + ":" + config.getPort() + "/" + config.getDatabase() + "?useUnicode=yes");
                hikariConfig.setUsername(config.getUsername());
                hikariConfig.setPassword(config.getPassword());
                hikariConfig.setMaxLifetime(600000L);
                hikariConfig.setIdleTimeout(300000L);
                hikariConfig.setLeakDetectionThreshold(300000L);
                hikariConfig.setMaximumPoolSize(10);
                hikariConfig.setConnectionTimeout(5000L);
                hikariConfig.addDataSourceProperty("useSSL", false);
                this.hikariDataSource = new HikariDataSource(hikariConfig);
                System.out.println("SQL Ready to use");
            }
            catch (Exception exception) {
                System.err.println("Problem loading SQL");
                this.hikariDataSource.close();
                this.hikariDataSource = null;
            }
        }
    }

    public void disconnect() {
        this.hikariDataSource.close();
    }

    public HikariDataSource getHikariDataSource() {
        return this.hikariDataSource;
    }

}
