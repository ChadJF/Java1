package java_2.oop.bank;

import java.util.List;

public class Bank {

	/*
		Properties:
			accounts;

		Methods :
			openAccount(); //create a new account, add it to the accounts list, and return it.
			closeAccount(Account); close the account by removing it from the account list. and removing it's association with this Bank
	 		getAccountByCustomer(Customer);
	 		getAccountByNumber(acctNum);
	 */

    String bankName = "All Star";
    List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account openAccount(int accountNum, Customer accountHolder, int balance, String type, List<String> transactions){
        Account newAccount = new Account(this.bankName, accountNum, accountHolder, balance, type, transactions);

        accounts.add(newAccount);

        return newAccount;
    }

    public void closeAccount(Account account){
        accounts.remove(account);
        System.out.println("Account removed.");
    }

    public void showAllAccounts(){
        for (Account account : accounts){
            System.out.println("Account Number "+account.getAccountNum()+" Customer "+account.getAccountHolder().getFirstName());
        }
    }

    public Account customerByNumber(int number){
        for (Account account : accounts){
            if (account.getAccountNum() == number){
                System.out.println(account);
                return account;
            }
        }
        return null;
    }

    public void getAccountByCustomer(Account Customer){
        if(accounts.contains(Customer)){
            System.out.println(Customer.accountHolder.firstName + " " + Customer.accountHolder.lastName);
        }
        else{
            System.out.println("Customer does not have an account with this bank");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
