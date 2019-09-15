package atm;

public class Account {
    private int accountID;
    private String password;
    private int checkingBalance;
    private int savingsBalance;

    Account(int accountID, String password, int checkingBalance, int savingsBalance) {
        this.accountID = accountID;
        this.password = password;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
    }

    Account(int accountID, String password) {
        this(accountID, password, 0, 0);
    }

    public int getID() {
        return accountID;
    }
}
