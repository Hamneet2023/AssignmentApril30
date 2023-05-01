package assignment29April;

import java.util.Scanner;

public class ATM extends BankOperations {

//	@Override
//	public double withDrawAmount() {
//		return super.withDrawAmount();
//	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the amount you want to deposit");
		depositAmount = sc.nextInt();
		double currentBalance = person.gettotalFunds();
		newBalance = currentBalance + depositAmount;

		return newBalance;
	}

	@Override
	public double withDrawAmount() {
		System.out.println("How much money you want to withdraw from you account");
		withDrawAmount = sc.nextInt();

		if (withDrawAmount < person.gettotalFunds()) {
			double currentBalance = person.gettotalFunds();
			newBalance = currentBalance - withDrawAmount;
		}
		return newBalance;
	}

	public void viewBalance() {

		System.out.println("current Balance is: " + person.gettotalFunds());
		person.setotalFunds(newBalance);
		System.out.println("New balance: " + person.gettotalFunds());
	}

}
