package SOLID;
//Interface should be like that such that client should not need to implement unnecessary functions that are present in particular interface.

public class InterfaceSegregation {
    public static void main(String[] args) {
        Human h = new Human();
        Robot r = new Robot();
        h.work();
        h.eat();    
        r.work();
        
    }
}
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {}
    public void eat() {}
}

class Robot implements Workable {
    public void work() {}
}