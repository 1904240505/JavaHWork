package boxAndContainerNumber;

import java.util.Scanner;

public class text1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义数据
		float MANAGER_COMMISSION = 0.12f;
		float SIZT_COMMISSION = 0.03f;

		int songNumber;
		float songPrice;

		float manaferCommission;
		float siteCommission;
		float myCommission;

		// 输入提醒

		System.out.println("请输入歌曲价格：");
		songPrice = scan.nextFloat();
		System.out.println("请输入歌单数量：");
		songNumber = scan.nextInt();

		// 数据处理
		manaferCommission = songNumber * songPrice * MANAGER_COMMISSION;
		siteCommission = songNumber * songPrice * SIZT_COMMISSION;
		myCommission = songNumber * songPrice - manaferCommission - siteCommission;

		// 数据输出
		System.out.println("经理的利润为：" + manaferCommission);
		System.out.println("站点的利润为：" + siteCommission);
		System.out.println("我的利润为：" + myCommission);

	}
}
