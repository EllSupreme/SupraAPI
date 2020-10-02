package io.supreme.supraapi.database.connection;

import io.supreme.supraapi.database.config.MongoDBConfig;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.io.IOException;

public class MongoDBConnection {

    private MongoDatabase mongoDatabase;
    private MongoClient mongoClient;

    public void connect(MongoDBConfig config) {
        if (config.isEnable()) {
            mongoClient = new MongoClient(new MongoClientURI("mongodb://" + config.getUsername() + ":" + config.getPassword() + "@" + config.getHost() + ":" + config.getPort() + "/" + config.getDatabase()));
            mongoDatabase = mongoClient.getDatabase(config.getDatabase());
        }
    }

    public void disconnect() throws IOException {
        mongoClient.close();
    }

    public MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

}
