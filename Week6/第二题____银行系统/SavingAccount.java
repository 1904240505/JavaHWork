package Week602_BankingApplication;

public class SavingAccount extends BankAccount {
	// 数据定义
	private double interestRate; // 利率

	// 构造
	public SavingAccount() {
		super();
		this.interestRate = 0;
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	// get与set
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// payInterest 支付利息
	public void payInterest() {
		super.setBalance(super.getBalance() * (1 + this.interestRate));
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "利率为：" + this.interestRate;
//		msg += super.toString();
		msg += "帐号：" + super.getAccountNum() + "\n";
		msg += "余额：" + super.getBalance() + "\n";
		return msg;
	}

}
