package Week602_BankingApplication;

public class CheckingAccount extends BankAccount {
	// ��������
	private double serviceCharge; // �����

	// ����
	public CheckingAccount() {
		super();
		this.serviceCharge = 0;
	}
	
	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	// get��set
	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	// assessServiceCharge ���������
	public void assessServiceCharge() {
		super.setBalance(super.getBalance() - this.serviceCharge);
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "��������ѣ�" + this.serviceCharge + "\n";
//		msg += super.toString();
		msg += "�ʺţ�" + super.getAccountNum() + "\n";
		msg += "��" + super.getBalance() + "\n";
		return msg;
	}
}
