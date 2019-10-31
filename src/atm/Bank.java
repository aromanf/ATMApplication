package atm;
import java.util.HashMap;
/*
    Bank is an object representation of a actual bank.
    A bank uses bank accounts for its customers to identify them and store their balance.
    An account can only be created and accessed from the bank.
    The user can only interact with the bank through the ATM machine and not directly.
 */

public class Bank {
    private HashMap<Integer, Account> accounts;

    Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(int accountID, String password) {
        Account newAccount = new Account(accountID, password);
        this.accounts.put(accountID, newAccount);
    }
    public Account getAccount(int accountId) {
        if(this.accounts.containsKey(accountId))
            return this.accounts.get(accountId);
        throw new IllegalArgumentException("This account does not exist.");
    }

    public boolean AccountExists(int accountId) {
        if(this.accounts.containsKey(accountId)) return true;
        else return false;
    }
}
