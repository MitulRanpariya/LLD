package Singleton;

public class DCL {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        System.out.println(db1 == db2); // true 
    }
}
class DBConnection {
    private static volatile DBConnection instance;

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
