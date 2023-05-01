package assignment29April;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankOperations bank = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Which banking service do you want to use? (ATM/Online Banking)");
		String bankingService = sc.nextLine();
		Person person = new Person();
		if (bankingService.equals("ATM")) {
			bank = new ATM();
			System.out.println("Enter your ATM pin:");
			String atmPassword = sc.nextLine();
			if (atmPassword.equals(person.getPin())) {
				System.out.println("Please enter which opertaion you want to perform(Withdraw/Deposit/View Balance)");
				String operation = sc.nextLine();
				switch (operation) {
				case "Withdraw":
					bank.withDrawAmount();
					break;
				case "Deposit":
					bank.depositMoney();
					break;
				case "View Balance":
					bank.viewBalance();
					break;
				default:
					System.out.println("Enter a vaid operation:");
					break;
				}
				bank.viewBalance();
			} else {
				System.out.println("ATM Password is incorrect,please enter a valid password:");
			}
		} // ATM if block ends here
		if (bankingService.equals("Online Banking")) {
			bank = new OnlineBanking();
			System.out.println("Enter your Online Banking Password:");
			String bankingPassword = sc.nextLine();
			if (bankingPassword.equals(person.getOnlineBankingPassword())) {
				System.out.println("Please enter which opertaion you want to perform(Withdraw/Deposit/View Balance)");
				String operation = sc.nextLine();
				switch (operation) {
				case "Withdraw":
					bank.withDrawAmount();
					break;
				case "Deposit":
					bank.depositMoney();
					break;
				case "View Balance":
					bank.viewBalance();
					break;
				default:
					System.out.println("Enter a vaid operation:");
					break;
				}
				bank.viewBalance();
			} else {
				System.out.println("Online Banking Password is incorrect,please enter valid password:");
			}
		} // ATM if block ends here

	}// main method ends here
}// main class ends here