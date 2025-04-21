package atm.core;

public class Server {
    public boolean connect() {
        return Math.random() > 0.1; // 90% chance of success
    }
}
