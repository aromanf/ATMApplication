package atm;
/*
    Automatic Teller Machine Application that allows depositing, withdrawal, and display of a balance
 */
public class ATMDisplay {
    public static void main(String[] args) {
        System.out.println("Automatic Teller Machine:");
        //TODO Design Classes
        // - ATM - The object through which the user interacts with balance. Withdraw, deposit, view, etc.

        Bank testBank = testATM();
        // Testing succesful creation of a HashMap containing accounts
        System.out.println("Test id : " + testBank.getAccount(54321).getID());


        //TODO Ask for user id and password. Validate it.
        System.out.println("Enter user id: ");
        System.out.println("Enter password: ");
        
        //TODO Implement a Switch case with ATM options when logged in
        // This will later be implemented into its own method or class
        System.out.println("Deposit.");
        System.out.println("Withdraw.");
        System.out.println("Check Balance.");
    }

    // Tester function for creating and testing a variety of scenarios
    public static Bank testATM() {
        //TODO Improve Tester Function for more effective testing
        // - Randomize account creation based on a set of rules
        // - Consider Edge cases and Corner cases
        // - Eventually implement unit testing

        Bank bank = new Bank();
        bank.createAccount(54321, "password");
        return bank;
    }
}
