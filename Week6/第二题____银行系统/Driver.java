package Week602_BankingApplication;

import java.util.Scanner;

public class Driver {

	public static BankAccount bankAccount;
	public static CheckingAccount check;
	public static SavingAccount save;
	public static Customer customer;
	public static double money = 10000; // ���ÿ��Ŀ�ʼ���
	public static boolean ok = false;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choose1 = menu1();
		int choose2;
		while (choose1 != 8) {
			switch (choose1) {
			case 1:
				creat();
				ok = true;
				break;
			case 2:
				if(!ok) {
					System.out.println("����ɿ���֮����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("���������");
				double balance = scan.nextDouble();
				save.setBalance(balance);
				break;
			case 3:
				if(!ok) {
					System.out.println("����ɿ���֮����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("������ȡ���");
				double getmoney = scan.nextDouble();
				if (getmoney > save.getBalance()) {
					System.out.println("���㣡");
				} else {
					save.setBalance(save.getBalance() - getmoney);
				}
				break;
			case 4:
				if(!ok) {
					System.out.println("����ɿ���֮����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("����������ˢ����");
				double xiaofei = scan.nextDouble();
				check.setBalance(check.getBalance() - xiaofei);
				break;
			case 5:
				if(!ok) {
					System.out.println("����ɿ���֮����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("�����뻹����" + "(Ӧ�����:" + money + ")��");
				double backmoney = scan.nextDouble();
				money -= backmoney;
				break;
			case 6:
				if(!ok) {
					System.out.println("����ɿ���֮����ִ�д˹��ܣ�");
					break;
				}
				check.setBalance(check.getBalance() - check.getServiceCharge());
				save.setBalance(save.getBalance() * (1 + save.getInterestRate()));
//				System.out.println("��������Ϊ��" + save.getBalance());
				break;
			case 7:
				if(!ok) {
					System.out.println("����ɿ���֮����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("���ÿ���" + check.getBalance());
				System.out.println("�洢����" + save.getBalance());
				System.out.println(customer.toString());
				break;
			default:
				System.out.println("����������������룡");
			}
			choose1 = menu1();
		}
		System.out.println("�ɹ��˳�����ϵͳ����ӭ�´�ʹ�ã�");
	}

	// �˵�1
	public static int menu1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭʹ������ϵͳ");
		System.out.println("    1.���� create");
		System.out.println("    2.��� save");
		System.out.println("    3.ȡ�� withdraw");
		System.out.println("    4.���� comsume");
		System.out.println("    5.���� repay");
		System.out.println("    6.���н��� settle");
		System.out.println("    7.��ѯ��� balance");
		System.out.println("    8.�˳� exit");
		System.out.print("    ��ѡ��1-8����");
		int choose = scan.nextInt();
		return choose;
	}

	// �˵�2
	public static int menu2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ�񿪿�����");
		System.out.println("    1.���ÿ� checkingAccount");
		System.out.println("    2.���濨 savingAccount");
		System.out.println("    3.���� exit");
		System.out.println("    ��ѡ��1-3����");
		int choose = scan.nextInt();
		return choose;
	}

	// ����
	public static void creat() {
		Scanner scan = new Scanner(System.in);
		int choose2 = menu2();
		while (choose2 != 3) {
			switch (choose2) {
			case 1: // ���ÿ�
				System.out.println("���������֤�ţ�");
				String Cssn = scan.next();
				System.out.println("������������");
				String Cname = scan.next();
				System.out.println("�����뿨�ţ�");
				String CaccountNum = scan.next();
				System.out.println("���������ѣ�");
				double serviceCharge = scan.nextDouble();

				bankAccount = new BankAccount(CaccountNum, money);
				check = new CheckingAccount(CaccountNum, money, serviceCharge);
//				save = new SavingAccount();
				customer = new Customer(Cssn, Cname, check, save);
				System.out.println("������ɣ�");
				break;
			case 2: // ���
				System.out.println("���������֤�ţ�");
				String Sssn = scan.next();
				System.out.println("������������");
				String Sname = scan.next();
				System.out.println("�����뿨�ţ�");
				String SaccountNum = scan.next();
				System.out.println("���������ʣ�");
				double SinterestRate = scan.nextDouble();

				bankAccount = new BankAccount(SaccountNum, 0);
//				check = new CheckingAccount();
				save = new SavingAccount(SaccountNum, 0, SinterestRate);
				customer = new Customer(Sssn, Sname, check, save);
				System.out.println("������ɣ�");
				break;
			default:
				System.out.println("����������������룡");
			}
			choose2 = menu2();
		}
		System.out.println("���سɹ���");
	}

}
