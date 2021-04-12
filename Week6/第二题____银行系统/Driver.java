package Week602_BankingApplication;

import java.util.Scanner;

public class Driver {

	public static BankAccount bankAccount;
	public static CheckingAccount check;
	public static SavingAccount save;
	public static Customer customer;
	public static double money = 10000; // 信用卡的开始金额
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
					System.out.println("请完成开户之后再执行此功能！");
					break;
				}
				System.out.println("请输入存款金额：");
				double balance = scan.nextDouble();
				save.setBalance(balance);
				break;
			case 3:
				if(!ok) {
					System.out.println("请完成开户之后再执行此功能！");
					break;
				}
				System.out.println("请输入取款金额：");
				double getmoney = scan.nextDouble();
				if (getmoney > save.getBalance()) {
					System.out.println("余额不足！");
				} else {
					save.setBalance(save.getBalance() - getmoney);
				}
				break;
			case 4:
				if(!ok) {
					System.out.println("请完成开户之后再执行此功能！");
					break;
				}
				System.out.println("请输入消费刷卡金额：");
				double xiaofei = scan.nextDouble();
				check.setBalance(check.getBalance() - xiaofei);
				break;
			case 5:
				if(!ok) {
					System.out.println("请完成开户之后再执行此功能！");
					break;
				}
				System.out.println("请输入还款金额" + "(应还金额:" + money + ")：");
				double backmoney = scan.nextDouble();
				money -= backmoney;
				break;
			case 6:
				if(!ok) {
					System.out.println("请完成开户之后再执行此功能！");
					break;
				}
				check.setBalance(check.getBalance() - check.getServiceCharge());
				save.setBalance(save.getBalance() * (1 + save.getInterestRate()));
//				System.out.println("结算后余额为：" + save.getBalance());
				break;
			case 7:
				if(!ok) {
					System.out.println("请完成开户之后再执行此功能！");
					break;
				}
				System.out.println("信用卡：" + check.getBalance());
				System.out.println("存储卡：" + save.getBalance());
				System.out.println(customer.toString());
				break;
			default:
				System.out.println("输入错误，请重新输入！");
			}
			choose1 = menu1();
		}
		System.out.println("成功退出银行系统，欢迎下次使用！");
	}

	// 菜单1
	public static int menu1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎使用银行系统");
		System.out.println("    1.开户 create");
		System.out.println("    2.存款 save");
		System.out.println("    3.取款 withdraw");
		System.out.println("    4.消费 comsume");
		System.out.println("    5.还款 repay");
		System.out.println("    6.银行结算 settle");
		System.out.println("    7.查询余额 balance");
		System.out.println("    8.退出 exit");
		System.out.print("    请选择（1-8）：");
		int choose = scan.nextInt();
		return choose;
	}

	// 菜单2
	public static int menu2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择开卡类型");
		System.out.println("    1.信用卡 checkingAccount");
		System.out.println("    2.储存卡 savingAccount");
		System.out.println("    3.返回 exit");
		System.out.println("    请选择（1-3）：");
		int choose = scan.nextInt();
		return choose;
	}

	// 开户
	public static void creat() {
		Scanner scan = new Scanner(System.in);
		int choose2 = menu2();
		while (choose2 != 3) {
			switch (choose2) {
			case 1: // 信用卡
				System.out.println("请输入身份证号：");
				String Cssn = scan.next();
				System.out.println("请输入姓名：");
				String Cname = scan.next();
				System.out.println("请输入卡号：");
				String CaccountNum = scan.next();
				System.out.println("请输入服务费：");
				double serviceCharge = scan.nextDouble();

				bankAccount = new BankAccount(CaccountNum, money);
				check = new CheckingAccount(CaccountNum, money, serviceCharge);
//				save = new SavingAccount();
				customer = new Customer(Cssn, Cname, check, save);
				System.out.println("输入完成！");
				break;
			case 2: // 储蓄卡
				System.out.println("请输入身份证号：");
				String Sssn = scan.next();
				System.out.println("请输入姓名：");
				String Sname = scan.next();
				System.out.println("请输入卡号：");
				String SaccountNum = scan.next();
				System.out.println("请输入利率：");
				double SinterestRate = scan.nextDouble();

				bankAccount = new BankAccount(SaccountNum, 0);
//				check = new CheckingAccount();
				save = new SavingAccount(SaccountNum, 0, SinterestRate);
				customer = new Customer(Sssn, Sname, check, save);
				System.out.println("输入完成！");
				break;
			default:
				System.out.println("输入错误，请重新输入！");
			}
			choose2 = menu2();
		}
		System.out.println("返回成功！");
	}

}
