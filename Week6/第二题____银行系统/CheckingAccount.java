package Week602_BankingApplication;

public class CheckingAccount extends BankAccount {
	// 定义数据
	private double serviceCharge; // 服务费

	// 构造
	public CheckingAccount() {
		super();
		this.serviceCharge = 0;
	}
	
	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	// get与set
	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	// assessServiceCharge 评估服务费
	public void assessServiceCharge() {
		super.setBalance(super.getBalance() - this.serviceCharge);
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "评估服务费：" + this.serviceCharge + "\n";
//		msg += super.toString();
		msg += "帐号：" + super.getAccountNum() + "\n";
		msg += "余额：" + super.getBalance() + "\n";
		return msg;
	}
}
