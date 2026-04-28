package SOLID;
//subclass should extend capability of parent class but not narrow it down
public class Liskov {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.fly();
        s.name();

        penguins p = new penguins();
        p.name();
    }
}

interface Bird {
    //every bird has a name.
    void name();
}

interface FlyingBird {
    //some birds can fly also.
    void fly();
}

class Sparrow implements Bird, FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }
    public void name() {
        System.out.println("Sparrow");
    }
}

class penguins  implements Bird {
    //this is bird but can not fly so it does not implement flyingbird interface. This way we can avoid the problem of liskov substitution principle.
    public void name() {
        System.out.println("Penguin");
    }
}