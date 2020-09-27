package io.supreme.supraapi.connection;

public class RedisConnection {

    private String ip;
    private int port;
    private String clientName;

    public RedisConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.clientName = "Redis_acces";
    }

    public String getClientName() {
        return clientName;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public String toRedisURL() {
        return "redis://" + ip + ":" + port;
    }

}
