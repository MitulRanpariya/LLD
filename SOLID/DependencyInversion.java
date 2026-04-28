package SOLID;

public class DependencyInversion {
    public static void main(String[] args) {
        Service s = new Service(new MySQL());
        s.execute();
        Service s1 = new Service(new MongoDB());
        s1.execute();
    }
    

}
interface Database {
    void save();
}

class MySQL implements Database {
    public void save() {
        System.out.println("Saved in MySQL");
    }
}

class MongoDB implements Database {
    public void save() {
        System.out.println("Saved in MongoDB");
    }
}

class Service {
    Database db;

    Service(Database db) {
        this.db = db;
    }

    void execute() {
        db.save();
    }
}
