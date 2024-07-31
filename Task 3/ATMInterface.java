public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);  // Initial balance is 1000.0
        ATM atm = new ATM(account);
        atm.start();
    }
}
