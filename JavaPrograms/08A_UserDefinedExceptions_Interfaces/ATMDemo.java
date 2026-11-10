import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance + ", Requested: " + amount);
        }
        balance -= amount;
        System.out.println("Please collect your cash: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

public class ATMDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(10000);
        System.out.println("Available balance: " + atm.getBalance());
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the ATM.");
        }
        sc.close();
    }
}
