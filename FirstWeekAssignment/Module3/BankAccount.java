package FirstWeekAssignment.Module3;
class BankAccount {

    private int accountNumber;
    private double balance;

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(12345, 5000);

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.display();
    }
}