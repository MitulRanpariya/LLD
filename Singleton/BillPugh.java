package Singleton;

public class BillPugh {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        System.out.println(db1 == db2); // true
    }
}
class DBConnection {

    private DBConnection() {}

    private static class Holder {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return Holder.INSTANCE;
    }
}
