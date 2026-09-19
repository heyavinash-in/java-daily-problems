class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Bank{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);

        System.out.println(account.getBalance());
    }
}