package Singleton;
//some time it may create multiple instance 
public class Lazy {
    public static void main(String[] args) {
        Runnable task = () -> {
            DBConnection db = DBConnection.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + db);
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    
    }
}
class DBConnection {
    private static DBConnection instance;

    private DBConnection() {
        System.out.println("I am called to intialize the instance");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
           
            instance = new DBConnection();
        }
        return instance;
    }
}
