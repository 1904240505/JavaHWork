package ClassTwo_HWork;

import java.util.Scanner;

public class HWork1_vedingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 数据定义
		int numberOf50CentCoins = 0;
		int numberOf20CentCoins = 0;
		int numberOf10CentCoins = 0;
		int numberOf5CentCoins = 0;

		double money,Money;

		// 数据输入
		System.out.print("请输入金额大小：");
		money = scan.nextDouble();
		Money=money;
		// 数据处理
		
		numberOf50CentCoins = (int) (money / (0.5));
		money = money - numberOf50CentCoins * 0.5;

		numberOf20CentCoins = (int) (money / 0.2);
		money = money - numberOf20CentCoins * 0.2;

		numberOf10CentCoins = (int) (money / 0.1);
		money = money - numberOf10CentCoins * 0.1;

		numberOf5CentCoins = (int) (money / 0.05);

		// 数据输出
		System.out.println(Money + "美元可以分为：");
		System.out.println(numberOf50CentCoins + "*50c");
		System.out.println(numberOf20CentCoins + "*20c");
		System.out.println(numberOf10CentCoins + "*10c");
		System.out.println(numberOf5CentCoins + "*5c");

	}
}
