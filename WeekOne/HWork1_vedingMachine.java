package ClassTwo_HWork;

import java.util.Scanner;

public class HWork1_vedingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ���ݶ���
		int numberOf50CentCoins = 0;
		int numberOf20CentCoins = 0;
		int numberOf10CentCoins = 0;
		int numberOf5CentCoins = 0;

		double money,Money;

		// ��������
		System.out.print("���������С��");
		money = scan.nextDouble();
		Money=money;
		// ���ݴ���
		
		numberOf50CentCoins = (int) (money / (0.5));
		money = money - numberOf50CentCoins * 0.5;

		numberOf20CentCoins = (int) (money / 0.2);
		money = money - numberOf20CentCoins * 0.2;

		numberOf10CentCoins = (int) (money / 0.1);
		money = money - numberOf10CentCoins * 0.1;

		numberOf5CentCoins = (int) (money / 0.05);

		// �������
		System.out.println(Money + "��Ԫ���Է�Ϊ��");
		System.out.println(numberOf50CentCoins + "*50c");
		System.out.println(numberOf20CentCoins + "*20c");
		System.out.println(numberOf10CentCoins + "*10c");
		System.out.println(numberOf5CentCoins + "*5c");

	}
}
