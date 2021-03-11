package WeekTwo;

import java.util.Scanner;

public class guessNumberGame2 {// 在guessNumberGame1的基础上增加一点，以实现多次猜测，直到猜到随机数
	public static void main(String[] age) {
		// 定义变量
		int randomNumber;
		int Myguess;

		// 随机数字
		randomNumber = 1 + (int) (Math.random() * 1000);

		System.out.println(randomNumber);
		System.out.println("I have a number between 1 and 1000");
		System.out.println("Could you guess it ?");
		System.out.println("please input your number");

		Scanner scan = new Scanner(System.in);

		while (true) {
			// 输入随机数
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
