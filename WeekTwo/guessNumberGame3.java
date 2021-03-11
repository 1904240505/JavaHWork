package WeekTwo;

import java.util.Scanner;

public class guessNumberGame3 {// 在guessNumberGame2的基础上增加猜测次数的限制
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

		for (int i = 1; i <= 5; i++) {

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
			} // else

			System.out.println("剩余猜测次数为：" + (5 - i));
		} // for

	}
}
