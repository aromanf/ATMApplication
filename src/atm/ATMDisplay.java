package atm;
/*
    Automatic Teller Machine Application that allows depositing, withdrawal, and display of a balance
 */
public class ATMDisplay {
    public static void main(String[] args) {
        System.out.println("Automatic Teller Machine:");
        //TODO Design Classes
        // - Bank - Bank is the object that holds the money and holds all user accounts.
        // - Account - The bank account of the user which holds id, etc.
        // - ATM - The object through which the user interacts with balance. Withdraw, deposit, view, etc.

        //TODO Ask for user id and password. Validate it.
        System.out.println("Enter user id: ");
        System.out.println("Enter password: ");
        
        //TODO Implement a Switch case with ATM options when logged in
        System.out.println("Deposit.");
        System.out.println("Withdraw.");
        System.out.println("Check Balance.");
    }
}
