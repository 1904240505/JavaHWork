package WeekTwo;

import java.util.Scanner;

public class guessNumberGame4 {// 在guessNumberGame3的基础上增加重玩提示！！！
	public static void main(String[] age) {

		String choose;
		do {
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

			System.out.println("是否再玩一次？（y/n）");
			Scanner scan1 = new Scanner(System.in);
			choose = scan1.nextLine();

		} while (choose.equals("y"));
		System.out.println("Game Over!!!");
	}

}
