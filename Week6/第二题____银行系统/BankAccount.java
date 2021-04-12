package Week602_BankingApplication;

public class BankAccount {
	// 定义数据
	private String accountNum; // 帐号
	private double balance; // 余额

	// 构造
	public BankAccount() {
		super();
		this.accountNum = "";
		this.balance = 0;
	}

	public BankAccount(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	// get与set
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "帐号：" + this.accountNum + "\n";
		msg += "余额" + this.balance + "\n";
		return msg;
	}

}
