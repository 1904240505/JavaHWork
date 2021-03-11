package boxAndContainerNumber;

import java.util.Scanner;

public class text2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 数据定义
		int boxNumber;
		int containerNumber;
		int totalBiscuits;

		int BOX = 24;
		int CONTAINER = 75;

		int surplusBiscuits;
		int surplusBox;

		// 数据输入提示
		System.out.print("请输入饼干总数：");

		totalBiscuits = scan.nextInt();

		// 数据处理
		boxNumber = totalBiscuits / BOX;
		surplusBiscuits = totalBiscuits % BOX;

		containerNumber = boxNumber / CONTAINER;
		surplusBox = boxNumber % CONTAINER;

		// 结果输出

		System.out.println("盒子的数量是：" + boxNumber);
		System.out.println("多余饼干数量为：" + surplusBiscuits);
		System.out.println("容器的数量是：" + containerNumber);
		System.out.println("多余盒子的数量为：" + surplusBox);
	}

}
