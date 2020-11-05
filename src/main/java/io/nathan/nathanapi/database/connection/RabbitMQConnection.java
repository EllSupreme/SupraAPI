package io.nathan.nathanapi.database.connection;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import io.nathan.nathanapi.database.config.RabbitMQConfig;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

public class RabbitMQConnection {

    private Connection connection;
    private ConnectionFactory connectionFactory = new ConnectionFactory();

    public void connect(RabbitMQConfig config) {
        if (config.isEnable()) {
            try {
                connectionFactory.setUri("amqp://" + config.getUsername() + ":" + config.getPassword() + "@" + config.getHost() + ":" + config.getPort());
                connection = connectionFactory.newConnection();
            } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException | TimeoutException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void disconnect() throws IOException {
        connection.close();
    }

    public Connection getConnection() {
        return connection;
    }

}
