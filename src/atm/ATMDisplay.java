package atm;

import java.util.Scanner;

/*
    Automatic Teller Machine Application that allows depositing, withdrawal, and display of a balance
 */
public class ATMDisplay {
    public static void main(String[] args) {
        System.out.println("Automatic Teller Machine:");
        //TODO Design Classes
        // - ATM - The object through which the user interacts with balance. Withdraw, deposit, view, etc.

        Bank bank = testATM();
        // Testing successful creation of a HashMap containing accounts
        System.out.println("Test id : " + bank.getAccount(54321).getID());


        //TODO Ask for user id and password. Validate it.
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter user id: ");
        int userID = Integer.parseInt(reader.nextLine());
        System.out.println("Enter password: ");
        String password = reader.nextLine();

        if(!bank.AccountExists(userID)) System.out.println("Account does not exist.");
        else if(bank.AccountExists(userID)) {
            Account account = bank.getAccount(userID);
            if(account.getPassword().equals(password)) {
                //TODO Implement a Switch case with ATM options when logged in
                // This will later be implemented into its own method or class
                System.out.println("1. Deposit.");
                System.out.println("2. Withdraw.");
                System.out.println("3. Check Balance.");

                int choice = Integer.parseInt(reader.nextLine());
                switch(choice) {
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        int amount = Integer.parseInt(reader.nextLine());
                        bank.getAccount(userID).depositToCheckingsAccount(amount);
                        System.out.println("Your Account now contains " + bank.getAccount(userID).getCheckingBalance());
                }
            }
            else System.out.println("Password is incorrect.");

        }
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
