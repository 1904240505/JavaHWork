package Week12;

import java.io.File;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Dao {
	// �ӱ���ж���ѧ����Ϣ,����ѧ������
	public static ArrayList<StudentVo> InputStu() {
		ArrayList<StudentVo> Stu = new ArrayList<StudentVo>();
		try {
			File file = new File("d:/class/StudentInformation.xls");
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			String id, name, gender;
			for (int i = 1; i < rows; i++) {
				Cell cell1 = sheet.getCell(0, i);
				id = cell1.getContents();
				Cell cell2 = sheet.getCell(1, i);
				name = cell2.getContents();
				Cell cell3 = sheet.getCell(2, i);
				gender = cell3.getContents();
				StudentVo student = new StudentVo(id, name, gender);
				System.out.println(student.toString() + "\n");
				Stu.add(student);
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Stu;
	}

	// �ӱ���ж���ѧ���γ���Ϣ,����ѧ���γ̼���
	public static ArrayList<CourseVo> InputCourse() {
		ArrayList<CourseVo> Cou = new ArrayList<CourseVo>();
		try {
			File file = new File("d:/class/CourseInformation.xls");
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			String id, couname;
			float score;
			for (int i = 1; i < rows; i++) {
				Cell cell1 = sheet.getCell(0, i);
				id = cell1.getContents();
				Cell cell2 = sheet.getCell(1, i);
				couname = cell2.getContents();
				Cell cell3 = sheet.getCell(2, i);
				score = Float.parseFloat(cell3.getContents());
				CourseVo course = new CourseVo(id, couname, score);
				System.out.println(course.toString() + "\n");
				Cou.add(course);
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Cou;
	}

	// ��ȡ��ѧ��ͳ�ƽ��
	public static ArrayList<AsStudentVo> getStuReasult(ArrayList<StudentVo> Stu, ArrayList<CourseVo> Cou) {
		ArrayList<AsStudentVo> AsStu = new ArrayList<AsStudentVo>();

		for (int i = 0; i < Stu.size(); i++) {
			StudentVo student = Stu.get(i);
			float avg = getAvg(student.getId(), Cou);
			String id = student.getId();
			String name = student.getName();
			String gender = student.getGender();
			AsStudentVo asStudent = new AsStudentVo(id, name, gender, avg);
			AsStu.add(asStudent);
		}

		return AsStu;
	}

	// ��ȡһ��ѧ����ƽ����
	public static float getAvg(String id, ArrayList<CourseVo> Cou) {
		float avg = 0;
		int count = 0;
		for (int i = 0; i < Cou.size(); i++) {
			CourseVo course = Cou.get(i);
			if (course.getId().equals(id)) {
				count++;
				avg += course.getScore();
			}
		}
		avg = avg / count;
		return avg;
	}

	// ��ȡ���γ�ͳ�ƽ��
	public static ArrayList<AsCourseVo> getCouReasult(ArrayList<CourseVo> Cou) {
		ArrayList<AsCourseVo> AsCou = new ArrayList<AsCourseVo>();
		ArrayList<courseTotal> couTotal = new ArrayList<courseTotal>();

		for (int i = 0; i < Cou.size(); i++) {
			CourseVo course = Cou.get(i);
			int index = ifExist(course.getCouName(), couTotal);// �ÿγ̲����ھͷ���-1
			if (index != -1) {
				courseTotal coutotal = couTotal.get(index);
				coutotal.setSum(coutotal.getSum() + course.getScore());
				coutotal.setCount(coutotal.getCount() + 1);
				couTotal.set(index, coutotal);// ���õ�index������
			} else {
				courseTotal coutotal = new courseTotal(course.getCouName(), course.getScore(), 1);
				couTotal.add(coutotal);
			}
		}

		for (int i = 0; i < couTotal.size(); i++) {
			String couName = couTotal.get(i).getCouName();
			float avg = couTotal.get(i).getSum() / couTotal.get(i).getCount();
			AsCourseVo asCou = new AsCourseVo(couName, avg);
			AsCou.add(asCou);
		}

		return AsCou;
	}

	// �鿴�γ��Ƿ��Ѵ���
	public static int ifExist(String CouName, ArrayList<courseTotal> couTotal) {
		int index = -1;

		for (int i = 0; i < couTotal.size(); i++) {
			courseTotal coutotal = couTotal.get(i);
			if (coutotal.getCouName().equals(CouName)) {
				return i;
			}
		}

		return index;
	}

}
