package ClassTwo_HWork;

import java.util.Scanner;

public class HWork2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 数据定义
		double length, width, area;// 长、宽、面积
		int frameType; // 镜框种类
		int ifColour; // 是否上色
		int numberOfCrown; // 王冠数量

		double costOfFrame = 0;// 总价钱

		// 数据输入+输入提示
		System.out.println("请输入照片的长度和宽度");
		System.out.print("长度:");
		length = scan.nextDouble();
		System.out.print("宽度:");
		width = scan.nextDouble();

		System.out.println("请选择镜框的类型（0:regular,1:fancy）");
		System.out.print("请选择：");
		frameType = scan.nextInt();

		System.out.println("是否对框架上色（0：否，1：是）");
		System.out.print("请选择：");
		ifColour = scan.nextInt();

		System.out.print("请输入放置王冠的数量：");
		numberOfCrown = scan.nextInt();

		// 数据处理
		area = length * width;// 框架面积

		costOfFrame += area * (0.02 + 0.07);// 硬纸板和玻璃费用

		if (frameType == 1) {
			costOfFrame += 1 * (length + width) * 2 * 0.25;// 高档框架
		} else {
			costOfFrame += 1 * (length + width) * 2 * 0.15;// 普通框架
		}

		if (ifColour == 1) { // 上色
			costOfFrame += 1 * (length + width) * 2 * 0.1;
		}

		costOfFrame += numberOfCrown * 0.35; // 王冠

		// 数据输出
		System.out.println("镜框的费用为：" + costOfFrame);
	}
}
