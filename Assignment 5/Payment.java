abstract class Payment {
    abstract void processPayment();
}

class UPIPayment extends Payment {
    void processPayment() {
        System.out.println("UPI payment");
    }
}

class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Card payment");
    }
}

class Main {
    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.processPayment();

        p = new CreditCardPayment();
        p.processPayment();
    }
}
