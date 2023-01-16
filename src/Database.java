public abstract class Database implements IDatabaseProducts, IDatabaseCustomer, IDatabaseOrder {
    public String server;
    public String database;
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Database(String server, String database) {
        this.server = server;
        this.database = database;
    }
}
