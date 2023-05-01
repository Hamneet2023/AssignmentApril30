package assignment29April;

import java.util.Scanner;

public class BankOperations {

	int withDrawAmount;
	int depositAmount;
	double newBalance;
	Scanner sc = new Scanner(System.in);
	Person person = new Person();

	public double withDrawAmount() {
		System.out.println("How much money you want to withdraw from you account");
		withDrawAmount = sc.nextInt();

		if (withDrawAmount < person.gettotalFunds()) {
			double currentBalance = person.gettotalFunds();
			newBalance = currentBalance - withDrawAmount;
		}
		return newBalance;
	}

	public double depositMoney() {
		System.out.println("How much money you want to deposit from you account:");
		depositAmount = sc.nextInt();

		double currentBalance = person.gettotalFunds();
		newBalance = currentBalance + depositAmount;
		return newBalance;
	}

	public void viewBalance() {

		System.out.println("current Balance is: " + person.gettotalFunds());
		person.setotalFunds(newBalance);
		System.out.println("New balance: " + person.gettotalFunds());
	}
}
