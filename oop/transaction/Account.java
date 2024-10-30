
import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    public Account() {
        this.balance = 0.0;
        this.transitionList = new ArrayList<>();
    }

    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * method add transaction.
     * amount : double
     * operation : string
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }

        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        }

        transitionList.add(new Transaction(operation, amount, balance));
    }

    /**
     * method print transaction.
     * operation
     * amount
     * balance
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.%n",
                    i + 1, 
                    (transaction.getOperation()
                    .equals(Transaction.DEPOSIT) ? "Nap tien" : "Rut tien"), 
                    transaction.getAmount(), 
                    transaction.getBalance());
        }
    }
}
