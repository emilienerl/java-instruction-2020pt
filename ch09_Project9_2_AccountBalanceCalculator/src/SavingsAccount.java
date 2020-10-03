
public class SavingsAccount extends Account {

	private double monthlyInterestRate;
	private double calculatedInterest;

	public SavingsAccount() {
		monthlyInterestRate = 0.0;
		calculatedInterest = 0.0;
	}

	public SavingsAccount(double initialBalance, double monthlyInterestRate) {
		super(initialBalance);
		this.monthlyInterestRate = monthlyInterestRate;
		this.calculatedInterest = 0.0;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public double getCalculatedInterest() {
		return calculatedInterest;
	}

	public void applyMonthlyInterest() {
		calculatedInterest = balance * monthlyInterestRate / 100.0;
		balance += calculatedInterest;
	}

}
