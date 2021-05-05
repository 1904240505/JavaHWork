package Dao;

import java.util.ArrayList;
import java.util.Scanner;

import Vo.CourseResult;
import Vo.ScoreInfomation;
import Vo.StudentInfomation;
import Vo.StudentResult;
import Vo.CourseTotal;

public class function_dao {
	// 保存学生基本信息,返回ArrayList StuInfo;
	public static ArrayList<StudentInfomation> InputStuInfo() {
		ArrayList<StudentInfomation> StuInfo = new ArrayList<StudentInfomation>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		while (!data.equals("end")) {
			String array[] = data.split(",|，");
			StudentInfomation stu = new StudentInfomation(array[0], array[1], array[2]);

			StuInfo.add(stu);
			data = scan.nextLine();
		}

		return StuInfo;
	}

	// 保存学生成绩，返回ArrayList ScoInfo;
	public static ArrayList<ScoreInfomation> InputScore() {
		ArrayList<ScoreInfomation> ScoInfo = new ArrayList<ScoreInfomation>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		while (!data.equals("end")) {
			String array[] = data.split(",|，");
			ScoreInfomation sco = new ScoreInfomation(array[0], array[1], Integer.parseInt(array[2]));// 将string换成int

			ScoInfo.add(sco);
			data = scan.nextLine();
		}

		return ScoInfo;
	}

	// 得到学生统计结果
	public static ArrayList<StudentResult> disposeStu(ArrayList<StudentInfomation> StuInfo,
			ArrayList<ScoreInfomation> ScoInfo) {
		ArrayList<StudentResult> StuRes = new ArrayList<StudentResult>();
		// 在成绩信息中通过学号找到成绩，并返回平均值
		for (int i = 0; i < StuInfo.size(); i++) {
			StudentInfomation stuinfo = StuInfo.get(i);// 获取前面的学生信息
			double avg = getAvgScore(stuinfo.getId(), ScoInfo);// 获得学生平均成绩

			StudentResult stures = new StudentResult(stuinfo.getId(), stuinfo.getName(), stuinfo.getGender(), avg);
			StuRes.add(stures);
		}

		return StuRes;
	}

	// 得到课程统计结果
	public static ArrayList<CourseResult> disposeCla(ArrayList<ScoreInfomation> ScoInfo) {
		ArrayList<CourseResult> CouRes = new ArrayList<CourseResult>();
		ArrayList<CourseTotal> CouTot = new ArrayList<CourseTotal>();

		for (int i = 0; i < ScoInfo.size(); i++) {
			int index = ifExist(ScoInfo.get(i).getCourse(), CouTot);// 查看课程是否存在,不存在返回-1，存在返回位置
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

	// 获得学生平均成绩
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

	// 查看课程是否存在,不存在返回-1，存在返回位置
	public static int ifExist(String s, ArrayList<CourseTotal> CouTot) {
		int index = -1;
		for (int i = 0; i < CouTot.size(); i++) {
			if (CouTot.get(i).getCourse().equals(s)) {
				return i;
			}
		}

		return index;
	}

	// 输出信息
	public static StringBuffer output(ArrayList<StudentResult> StuRes, ArrayList<CourseResult> CouRes) {
		StringBuffer result = new StringBuffer();

		result.append("按学生统计：");
		result.append("\n学号\t姓名\t性别\t平均分\n");
		for (int i = 0; i < StuRes.size(); i++) {
			result.append(StuRes.get(i).toString() + "\n");
		}

		result.append("\n按课程统计：");
		result.append("\n课程\t平均分\n");
		for (int i = 0; i < CouRes.size(); i++) {
			result.append(CouRes.get(i).toString() + "\n");
		}

		return result;
	}
}
