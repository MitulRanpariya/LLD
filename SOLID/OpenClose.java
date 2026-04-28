package SOLID;
//here we can add any no.of new payment methods regardless of modifying the existing code. 
public class OpenClose {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.process(new UPI());
        ps.process(new Card());
    }
}
interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class Card implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

class PaymentService {
    void process(Payment p) {
        p.pay();
    }
}