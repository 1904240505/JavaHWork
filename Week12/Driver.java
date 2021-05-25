package Week12;

import java.io.File;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;
//import jxl.write.biff.RowsExceededException;

public class Driver {
	public static void main(String[] args) {
		// ��ȡѧ����Ϣ
		ArrayList<StudentVo> studentvo = new ArrayList<StudentVo>();
		studentvo = Dao.InputStu();
		// ��ȡѧ���γ���Ϣ
		ArrayList<CourseVo> courseVo = new ArrayList<CourseVo>();
		courseVo = Dao.InputCourse();
		// ��ȡ��ѧ��ͳ�ƽ��
		ArrayList<AsStudentVo> AsStu = Dao.getStuReasult(studentvo, courseVo);
		// ��ȡ���γ�ͳ�ƽ��
		ArrayList<AsCourseVo> AsCou = Dao.getCouReasult(courseVo);

		// �����д�����
		try {
			File file = new File("d:/class/StudentReasult.xls");
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			WritableSheet sheet0 = workbook.createSheet("��ѧ��ͳ�ƽ��", 0);
			WritableSheet sheet1 = workbook.createSheet("���γ�ͳ�ƽ��", 1);
			String[] titles = { "ѧ��", "����", "�Ա�", "ƽ����" };
			String[] titles1 = { "�γ�", "ƽ����" };
			// ���õ�һ��
			// ��1
			for (int i = 0; i < titles.length; i++) {
				sheet0.addCell(new Label(i, 0, titles[i]));
			}

			for (int i = 1; i < AsStu.size(); i++) {
				String avg = String.valueOf(AsStu.get(i).getAvgScore());
				sheet0.addCell(new Label(0, i, AsStu.get(i).getId()));
				sheet0.addCell(new Label(1, i, AsStu.get(i).getName()));
				sheet0.addCell(new Label(2, i, AsStu.get(i).getGender()));
				sheet0.addCell(new Label(3, i, avg));

			}
			// ��2
			for (int i = 0; i < titles1.length; i++) {
				sheet1.addCell(new Label(i, 0, titles1[i]));
			}

			for (int i = 1; i < AsCou.size(); i++) {
				String avg = String.valueOf(AsCou.get(i).getAvgScore());
				sheet1.addCell(new Label(0, i, AsCou.get(i).getCouName()));
				sheet1.addCell(new Label(1, i, avg));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
