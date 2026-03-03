package secondWeekAssignment.module4;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Credit Card.");
    }
}

class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using UPI.");
    }
}


public class Main1 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(5000);
        p2.pay(1500);
    }
}