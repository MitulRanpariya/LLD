package Singleton;

public class enumUse {
    public static void main(String[] args) {
        DB1Connection db1 = DB1Connection.INSTANCE;
        DB1Connection db2 = DB1Connection.INSTANCE;
        System.out.println(db1 == db2); // true
        db1.connect();
    }
}
enum DB1Connection {
    INSTANCE;

    public void connect() {
        System.out.println("Connected to DB");
    }
}
