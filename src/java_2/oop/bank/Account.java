package java_2.oop.bank;

import java.util.List;

public class Account {

	/*
		Properties:
			Bank (bank where the account is stored)
			accountNumber
			accountHolder (Customer)
			balance
			type (savings, checking, etc.)
			transactions (list of transactions)

		Methods :
			deposit(money); //add to the balance and the transaction history
			withdraw(money); //withdraw from the balance and add to the transaction history;


	 */

    String bankName;
    int accountNum;
    Customer accountHolder;
    int balance;
    String type;
    List<String> transactions;

    public Account(String bankName, int accountNum, Customer accountHolder, int balance, String type, List<String> transactions) {
        this.bankName = bankName;
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type = type;
        this.transactions = transactions;
    }

    public void withdraw(double money){
        accountHolder.setWallet(+money);
        balance -= money;
        transactions.add("withdrew "+money+" successfully");
    }

    public void deposit(double money){
        accountHolder.setWallet(-money);
        balance += money;
        transactions.add("deposited "+money+" successfully");
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "bankName='" + bankName + '\'' +
                ", accountNum=" + accountNum +
                ", accountHolder=" + accountHolder +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
