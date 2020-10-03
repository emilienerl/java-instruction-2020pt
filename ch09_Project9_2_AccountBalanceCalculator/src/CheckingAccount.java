
public class CheckingAccount extends Account {

	// Fields
	private double monthlyFee;

	// Constructors
	public CheckingAccount() {
		monthlyFee = 0.0;
	}

	public CheckingAccount(double initialBalance, double monthlyFee) {
		// calling a constructor in your base class
		super(initialBalance);
		this.monthlyFee = monthlyFee;
	}

	// Getters
	public double getMonthlyFee() {
		return monthlyFee;
	}

	// Helpers
	public void applyMonthlyFee() {
		balance -= monthlyFee;
		// double newBalance = getBalance() - monthlyFee;

	}
}
