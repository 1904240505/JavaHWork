package boxAndContainerNumber;

import java.util.Scanner;

public class text1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ��������
		float MANAGER_COMMISSION = 0.12f;
		float SIZT_COMMISSION = 0.03f;

		int songNumber;
		float songPrice;

		float manaferCommission;
		float siteCommission;
		float myCommission;

		// ��������

		System.out.println("����������۸�");
		songPrice = scan.nextFloat();
		System.out.println("������赥������");
		songNumber = scan.nextInt();

		// ���ݴ���
		manaferCommission = songNumber * songPrice * MANAGER_COMMISSION;
		siteCommission = songNumber * songPrice * SIZT_COMMISSION;
		myCommission = songNumber * songPrice - manaferCommission - siteCommission;

		// �������
		System.out.println("���������Ϊ��" + manaferCommission);
		System.out.println("վ�������Ϊ��" + siteCommission);
		System.out.println("�ҵ�����Ϊ��" + myCommission);

	}
}
