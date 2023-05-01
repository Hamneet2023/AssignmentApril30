package assignment29April;

public class Person {
	private String name;
	private String bankAccountNo;
	private double totalFunds =2000;
	private String pin = "1234";
	private String onlineBankingPassword="1234p";

	public String getPin() {
		return this.pin;
	}

	public String getOnlineBankingPassword() {
		return this.onlineBankingPassword;
	}
	public double gettotalFunds() {
		return this.totalFunds;
	}
	public double setotalFunds(double funds) {
		this.totalFunds =funds;
		return totalFunds;
	}

	public String getName() {
		return name;
	}
	

}
