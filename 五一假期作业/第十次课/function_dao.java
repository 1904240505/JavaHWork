package Dao;

import java.util.ArrayList;
import java.util.Scanner;

import Vo.CourseResult;
import Vo.ScoreInfomation;
import Vo.StudentInfomation;
import Vo.StudentResult;
import Vo.CourseTotal;

public class function_dao {
	// ����ѧ��������Ϣ,����ArrayList StuInfo;
	public static ArrayList<StudentInfomation> InputStuInfo() {
		ArrayList<StudentInfomation> StuInfo = new ArrayList<StudentInfomation>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		while (!data.equals("end")) {
			String array[] = data.split(",|��");
			StudentInfomation stu = new StudentInfomation(array[0], array[1], array[2]);

			StuInfo.add(stu);
			data = scan.nextLine();
		}

		return StuInfo;
	}

	// ����ѧ���ɼ�������ArrayList ScoInfo;
	public static ArrayList<ScoreInfomation> InputScore() {
		ArrayList<ScoreInfomation> ScoInfo = new ArrayList<ScoreInfomation>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		while (!data.equals("end")) {
			String array[] = data.split(",|��");
			ScoreInfomation sco = new ScoreInfomation(array[0], array[1], Integer.parseInt(array[2]));// ��string����int

			ScoInfo.add(sco);
			data = scan.nextLine();
		}

		return ScoInfo;
	}

	// �õ�ѧ��ͳ�ƽ��
	public static ArrayList<StudentResult> disposeStu(ArrayList<StudentInfomation> StuInfo,
			ArrayList<ScoreInfomation> ScoInfo) {
		ArrayList<StudentResult> StuRes = new ArrayList<StudentResult>();
		// �ڳɼ���Ϣ��ͨ��ѧ���ҵ��ɼ���������ƽ��ֵ
		for (int i = 0; i < StuInfo.size(); i++) {
			StudentInfomation stuinfo = StuInfo.get(i);// ��ȡǰ���ѧ����Ϣ
			double avg = getAvgScore(stuinfo.getId(), ScoInfo);// ���ѧ��ƽ���ɼ�

			StudentResult stures = new StudentResult(stuinfo.getId(), stuinfo.getName(), stuinfo.getGender(), avg);
			StuRes.add(stures);
		}

		return StuRes;
	}

	// �õ��γ�ͳ�ƽ��
	public static ArrayList<CourseResult> disposeCla(ArrayList<ScoreInfomation> ScoInfo) {
		ArrayList<CourseResult> CouRes = new ArrayList<CourseResult>();
		ArrayList<CourseTotal> CouTot = new ArrayList<CourseTotal>();

		for (int i = 0; i < ScoInfo.size(); i++) {
			int index = ifExist(ScoInfo.get(i).getCourse(), CouTot);// �鿴�γ��Ƿ����,�����ڷ���-1�����ڷ���λ��
			if (index != -1) {
				CourseTotal coutot = CouTot.get(index);
				coutot.setTotal(coutot.getTotal() + ScoInfo.get(i).getGrade());
				coutot.setNum(coutot.getNum() + 1);
				CouTot.set(index, coutot);
			} else {
				CourseTotal coutot = new CourseTotal(ScoInfo.get(i).getCourse(), ScoInfo.get(i).getGrade(), 1);
				CouTot.add(coutot);
			}

		}

		for (int i = 0; i < CouTot.size(); i++) {
			CourseTotal coutot = CouTot.get(i);
			CourseResult coures = new CourseResult(coutot.getCourse(), coutot.getTotal() / coutot.getNum());
			CouRes.add(coures);
		}

		return CouRes;
	}

	// ���ѧ��ƽ���ɼ�
	public static double getAvgScore(String s, ArrayList<ScoreInfomation> ScoInfo) {
		double avg = 0, count = 0;
		for (int i = 0; i < ScoInfo.size(); i++) {
			if (ScoInfo.get(i).getId().equals(s)) {
				avg += ScoInfo.get(i).getGrade();
				count++;
			}
		}
		avg /= count;
		return avg;
	}

	// �鿴�γ��Ƿ����,�����ڷ���-1�����ڷ���λ��
	public static int ifExist(String s, ArrayList<CourseTotal> CouTot) {
		int index = -1;
		for (int i = 0; i < CouTot.size(); i++) {
			if (CouTot.get(i).getCourse().equals(s)) {
				return i;
			}
		}

		return index;
	}

	// �����Ϣ
	public static StringBuffer output(ArrayList<StudentResult> StuRes, ArrayList<CourseResult> CouRes) {
		StringBuffer result = new StringBuffer();

		result.append("��ѧ��ͳ�ƣ�");
		result.append("\nѧ��\t����\t�Ա�\tƽ����\n");
		for (int i = 0; i < StuRes.size(); i++) {
			result.append(StuRes.get(i).toString() + "\n");
		}

		result.append("\n���γ�ͳ�ƣ�");
		result.append("\n�γ�\tƽ����\n");
		for (int i = 0; i < CouRes.size(); i++) {
			result.append(CouRes.get(i).toString() + "\n");
		}

		return result;
	}
}
