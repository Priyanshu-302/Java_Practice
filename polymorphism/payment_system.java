package polymorphism;

class Payment {
    void pay() {
        System.out.println("Generic Payment");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("UPI Payment");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Card Payment");
    }
}

public class payment_system {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}
