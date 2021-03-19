package WeekThree;

import java.util.Scanner;

public class StudentScoreSystem {

//	public static double score[] = null; // �ȶ���ȫ��

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double score[] = null;
		String stop;
		
		int choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				score = new double[5];
				input(score);
				break;
			case 2:
				if (score == null) {
					System.out.println("��������ɼ�����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("ƽ���ɼ��ǣ�" + getAge(score));
				//��ͣһ��
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			case 3:
				if (score == null) {
					System.out.println("��������ɼ�����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("��߳ɼ��ǣ�" + getMax(score));
				//��ͣһ��
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			case 4:
				if (score == null) {
					System.out.println("��������ɼ�����ִ�д˹��ܣ�");
					break;
				}
				System.out.println("��ͳɼ��ǣ�" + getMin(score));
				//��ͣһ��
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			case 5:
				if (score == null) {
					System.out.println("��������ɼ�����ִ�д˹��ܣ�");
					break;
				}
				output(score);
				//��ͣһ��
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			default:
				System.out.println("ѡ����Ч��������ѡ��");
			}// switch
			choose = menu();
		} // while
		System.out.println("�����˳�����ӭ�ٴ�ʹ�ã�");

	}

	// ��ɲ˵���ӡ������ѡ���ѡ��
	public static int menu() {
		int choose = 0;
		System.out.println("------ѧ���ɼ�ϵͳ------");
		System.out.println("1.����ѧ���ɼ�(5��ѧ��)");
		System.out.println("2.���ѧ���ɼ�ƽ��ֵ");
		System.out.println("3.�����߳ɼ�");
		System.out.println("4.�����ͳɼ�");
		System.out.println("5.����С������������ɼ�");
		System.out.println("6.�˳�");
		System.out.println("��ѡ��1~6��");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	// ����ѧ���ɼ�
	public static void input(double score[]) {
		System.out.println("�ɼ���Χ��0~100��");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println("�������" + (i + 1) + "��ѧ���ĳɼ�:");
			boolean ok = true;
			while (ok) {
				score[i] = scan.nextDouble();
				if (score[i] < 0 || score[i] > 100) {
					System.out.println("�ɼ���Ч�������������" + (i + 1) + "��ѧ���ĳɼ���");
				} else {
					ok = false;
				}
			} // while
		} // for

	}

	// ����ƽ��ֵ
	public static double getAge(double score[]) {
		double age = 0, sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		age = sum / score.length;

		return age;
	}

	// �������ֵ
	public static double getMax(double score[]) {
		double Max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (Max < score[i]) {
				Max = score[i];
			}
		}
		return Max;
	}

	// �������ֵ
	public static double getMin(double score[]) {
		double Min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (Min > score[i]) {
				Min = score[i];
			}
		}
		return Min;
	}

	// ��˳������ɼ�����С����
	public static void output(double score[]) {
		double temp;
		//ð������
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] > score[j + 1]) {
					temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		//���
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " ");
		}
	}

}
