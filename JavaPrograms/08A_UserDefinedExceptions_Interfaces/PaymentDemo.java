interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI ID: " + upiId);
    }
}

class CardPayment implements Payment {
    String cardHolder;

    CardPayment(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card of " + cardHolder);
    }
}

public class PaymentDemo {
    static void checkout(Payment p, double amount) {
        p.pay(amount);
    }

    public static void main(String[] args) {
        Payment p1 = new UPIPayment("user@okbank");
        Payment p2 = new CardPayment("Ravi Kumar");
        checkout(p1, 1500);
        checkout(p2, 2500);

        System.out.println("\nHow interfaces support abstraction:");
        System.out.println("1. Payment interface declares WHAT to do (pay) but not HOW to do it.");
        System.out.println("2. UPIPayment and CardPayment provide their own implementation details.");
        System.out.println("3. checkout() works with the Payment type only, hiding implementation details.");
        System.out.println("4. New payment types can be added without changing existing code.");
    }
}
