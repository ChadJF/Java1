package java_2.oop.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankingApp {

	public static void main(String[] args) {
			/*
				-Create a Bank
				-Create 5 Customers
				-Open a new account for each customer.
				-have 3 customers withdraw and deposit, making sure the account balances update.
				-Close 2 of the customer accounts.
				-view the opened accounts at the Bank.
				-find an account by any of the customer credentials
				-find an account by account number.
		 	*/

		// Classes, instantiation, encapsulation

		// List<Customer> customer = new ArrayList<>();
		Customer customer1 = new Customer("Chad", "Fouts", 12345, "52389", 100);
		Customer customer2 = new Customer("Some", "Body", 12345, "52389", 100);
		Customer customer3 = new Customer("Once", "Told", 12345, "52389", 100);
		Customer customer4 = new Customer("Me", "I", 12345, "52389", 100);
		Customer customer5 = new Customer("Aint", "The", 12345, "52389", 100);

		List<String> transaction1 = new ArrayList<>();
		List<String> transaction2 = new ArrayList<>();
		List<String> transaction3 = new ArrayList<>();
		List<String> transaction4 = new ArrayList<>();
		List<String> transaction5 = new ArrayList<>();

		List<Account> listAccounts = new ArrayList<>(Arrays.asList());
		Bank theBank = new Bank(listAccounts);

		Account chadsAccount = theBank.openAccount(1234567, customer1, 0, "savings", transaction1);
		Account somesAccount = theBank.openAccount(54321, customer2, 0, "checking", transaction2);
		Account oncesAccount = theBank.openAccount(987654, customer3, 0, "savings", transaction3);
		Account mesAccount = theBank.openAccount(258741, customer4, 0, "checking", transaction4);
		Account aintsAccount = theBank.openAccount(369852, customer5, 0, "savings", transaction5);

		theBank.showAllAccounts();
		theBank.closeAccount(chadsAccount);
		theBank.closeAccount(somesAccount);
		theBank.showAllAccounts();
		theBank.customerByNumber(258741);
		theBank.getAccountByCustomer(chadsAccount);
		theBank.getAccountByCustomer(oncesAccount);
	}



}
