package Week602_BankingApplication;

public class SavingAccount extends BankAccount {
	// ���ݶ���
	private double interestRate; // ����

	// ����
	public SavingAccount() {
		super();
		this.interestRate = 0;
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	// get��set
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// payInterest ֧����Ϣ
	public void payInterest() {
		super.setBalance(super.getBalance() * (1 + this.interestRate));
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "����Ϊ��" + this.interestRate;
//		msg += super.toString();
		msg += "�ʺţ�" + super.getAccountNum() + "\n";
		msg += "��" + super.getBalance() + "\n";
		return msg;
	}

}
