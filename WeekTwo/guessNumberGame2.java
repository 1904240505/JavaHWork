package WeekTwo;

import java.util.Scanner;

public class guessNumberGame2 {// ��guessNumberGame1�Ļ���������һ�㣬��ʵ�ֶ�β²⣬ֱ���µ������
	public static void main(String[] age) {
		// �������
		int randomNumber;
		int Myguess;

		// �������
		randomNumber = 1 + (int) (Math.random() * 1000);

		System.out.println(randomNumber);
		System.out.println("I have a number between 1 and 1000");
		System.out.println("Could you guess it ?");
		System.out.println("please input your number");

		Scanner scan = new Scanner(System.in);

		while (true) {
			// ���������
			Myguess = scan.nextInt();

			if (Myguess == randomNumber) {
				System.out.println("NB!!! you guessed the number");
				break;
			} else {
				if (Myguess < randomNumber) {
					System.out.println("too low!");
				} else {
					System.out.println("too high!");
				}
			}
		}

	}
}
