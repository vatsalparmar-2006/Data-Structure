// 37. Create a class BankAccount with attributes like account number, balance,
// account holder and name. Create an array of BankAccount objects to store
// bank accounts. Implement methods to deposit money, withdraw money and
// check balance.

import java.util.*;

public class BankDetails {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		BankAccount[] account = new BankAccount[5];

		for(int i=0; i<account.length; i++){
			account[i] = new BankAccount();
		}

		for(int i=0; i<account.length; i++){
			account[i].getAccountNo();
			account[i].getAccountHolderName();
		}

		for(int i=0; i<account.length; i++){
			System.out.println();
			System.out.print("Enter deposit amount : ");
			int depositAmount = sc.nextInt();
			account[i].deposit(depositAmount);
		}

		for(int i=0; i<account.length; i++){
			account[i].checkBalance();
		}
	}
}

class BankAccount {
	private String accountNo;
	private double balance = 100 ;
	private String accountHolderName;

	// public BankAccount(String accountNo,double balance,String accountHolderName){
	// 	this.accountNo = accountNo;
	// 	this.balance = balance;
	// 	this.accountHolderName = accountHolderName;
	// }

	public void deposit(double amount){
		if(amount>0){
			balance += amount;
			System.out.println("After Deposit Balance : "+balance);
		}
		else{
			System.out.println("Invalid amount for deposit.");
		}
	}

	public void withdraw(double amount){
		if(amount>0 && amount <= balance){
			balance -= amount;
			System.out.println("After withdraw Balance : "+balance);
		}
		else{
			System.out.println("Invalid amount for withdraw.");
		}
	}

	public double checkBalance(){
		return balance;
	}

	public void getAccountNo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter accountNo : ");
		accountNo = sc.next();
	}

	public void getAccountHolderName(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter accountHolderName : ");
		accountHolderName = sc.next();
	}
}