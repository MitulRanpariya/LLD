package Singleton;

public class Synchronized {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        System.out.println(db1 == db2); // true
    }
}
class DBConnection {
    private static DBConnection instance;

    private DBConnection() {}

    public static synchronized DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}