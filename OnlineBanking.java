package assignment29April;

public class OnlineBanking extends BankOperations {

//	@Override
//	public double withDrawAmount() {
//		return super.withDrawAmount();
//	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the amount you want to deposit");
		depositAmount = sc.nextInt();

		double currentBalance= person.gettotalFunds();
		newBalance = currentBalance + depositAmount;

		return newBalance;
	}

	@Override
	public double withDrawAmount() {
		System.out.println("Enter the amount you want to withdraw");
		withDrawAmount = sc.nextInt();

		if (person.gettotalFunds() > withDrawAmount) {
			double  currentBalance = person.gettotalFunds();
			newBalance =  currentBalance - withDrawAmount;
		}

		return newBalance;
	}
	@Override
	public void viewBalance() {

		System.out.println("current Balance is: " + person.gettotalFunds());
		person.setotalFunds(newBalance);
		System.out.println("New balance: " + person.gettotalFunds());
	}

}
