package WeekThree;

import java.util.Scanner;

public class FirstAndSecondNumber {
	// ����������������һ������С�ڵڶ���������ѭ�����й���
//	1.��ʾ�û�����������������һ������С�ڵڶ���
//	2.���first��second֮�����������
//	3.���first��second֮�������ż���ĺ�
//	4.���1~10֮������������Լ����ǵ�ƽ��
//	5.���first��second֮�������������ƽ����
//	6.������д�д��ĸ����Ascll���ʾ������������

	public static int First, Second, flag = 0;

	public static void main(String[] args) {
		int choose;
		choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (flag == 0) {
					System.out.println("��������������������ִ�д˹��ܣ�");
					break;
				}
				outputOdd();
				break;
			case 3:
				if (flag == 0) {
					System.out.println("��������������������ִ�д˹��ܣ�");
					break;
				}
				outputEvenSum();
				break;
			case 4:
				if (flag == 0) {
					System.out.println("��������������������ִ�д˹��ܣ�");
					break;
				}
				outputSquares();
				break;
			case 5:
				if (flag == 0) {
					System.out.println("��������������������ִ�д˹��ܣ�");
					break;
				}
				sumOfSquaresOfOdd();
				break;
			default:
				System.out.println("������Ч�����������룡");
			}// switch
			choose = menu();
		} // while;
		System.out.println("�ɹ��˳�����ӭ�´�ʹ�ã�");
	}

	// ��ӡ�˵�
	public static int menu() {
		int choose;
		System.out.println("=========�˵�=========");
		System.out.println("1.����������������һ������С�ڵڶ���");
		System.out.println("2.���first��second֮�����������");
		System.out.println("3.���first��second֮�������ż���ĺ�");
		System.out.println("4.���1~10֮������������Լ����ǵ�ƽ��");
		System.out.println("5.���first��second֮�������������ƽ����");
		System.out.println("6.�˳�");
		System.out.println("��ѡ��ѡ�1~6����");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	// ������������
	public static void input() {
		flag = 1;
		Scanner scan = new Scanner(System.in);
		boolean ok = false;
		while (!ok) {
			System.out.println("�������һ��������");
			First = scan.nextInt();
			System.out.println("������ڶ���������");
			Second = scan.nextInt();
			if (First < Second) {
				ok = true;
			} else {
				System.out.println("��һ�����������ڵڶ������������������룡");
			}
		}

	}

	// ���������֮�������
	public static void outputOdd() {
		System.out.println("����Ϊ��");
		for (int i = First; i <= Second; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// ���first��second֮�������ż���ĺ�
	public static void outputEvenSum() {
		int sum = 0;
		for (int i = First; i <= Second; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("ż����Ϊ��" + sum);
	}

	// ���1~10֮������������Լ����ǵ�ƽ��
	public static void outputSquares() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println("1~10��ƽ��Ϊ��");
		for (int i = 1; i <= 10; i++) {
			System.out.println(Math.pow(i, 2) + " ");
		}
	}

	// ���first��second֮�������������ƽ����
	public static void sumOfSquaresOfOdd() {
		int sum = 0;
		for (int i = First; i <= Second; i++) {
			if (i % 2 != 0) {
				sum += Math.pow(i, 2);
			}
		}
		System.out.println("������ƽ����Ϊ��" + sum);
	}
}
