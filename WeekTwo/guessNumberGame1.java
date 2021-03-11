package WeekTwo;

import java.util.Scanner;

public class guessNumberGame1 {
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

		Myguess = scan.nextInt();

		if (Myguess == randomNumber) {
			System.out.println("NB!!! you guessed the number");
		} else {
			if (Myguess < randomNumber) {
				System.out.println("too low!");
			} else {
				System.out.println("too high!");
			}
		}
	}

}
