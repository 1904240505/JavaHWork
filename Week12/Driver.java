package Week12;

import java.io.File;
import java.util.ArrayList;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class Driver {
	public static void main(String[] args) {
		// 读取学生信息
		ArrayList<StudentVo> studentvo = new ArrayList<StudentVo>();
		studentvo = Dao.InputStu();
		// 读取学生课程信息
		ArrayList<CourseVo> courseVo = new ArrayList<CourseVo>();
		courseVo = Dao.InputCourse();
		// 获取按学生统计结果
		ArrayList<AsStudentVo> AsStu = Dao.getStuReasult(studentvo, courseVo);
		// 获取按课程统计结果
		ArrayList<AsCourseVo> AsCou = Dao.getCouReasult(courseVo);

		/*
		 * AsStudentVo asstu = new AsStudentVo(); for(int i=0;i<AsStu.size();i++) {
		 * asstu = AsStu.get(i); System.out.println(asstu.toString()); }
		 * 
		 * AsCourseVo ascou = new AsCourseVo(); for(int i=0;i<AsCou.size();i++) { ascou
		 * = AsCou.get(i); System.out.println(ascou.toString()); }
		 */

		// 将结果写入表中
		try {
			File file = new File("d:/class/StudentReasult.xls");
			file.createNewFile();
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			WritableSheet sheet0 = workbook.createSheet("按学号统计", 0);
			WritableSheet sheet1 = workbook.createSheet("按课程统计", 1);
			String[] titles = { "学号", "姓名", "性别", "平均分" };
			String[] titles1 = { "课程", "平均分" };
			// 设置第一行
			// 表1
			for (int i = 0; i < titles.length; i++) {
				sheet0.addCell(new Label(i, 0, titles[i]));
			}

			for (int i = 0; i < AsStu.size(); i++) {
				String avg = String.valueOf(AsStu.get(i).getAvgScore());
				sheet0.addCell(new Label(0, i + 1, AsStu.get(i).getId()));
				sheet0.addCell(new Label(1, i + 1, AsStu.get(i).getName()));
				sheet0.addCell(new Label(2, i + 1, AsStu.get(i).getGender()));
				sheet0.addCell(new Label(3, i + 1, avg));

			}
			// 表2
			for (int i = 0; i < titles1.length; i++) {
				sheet1.addCell(new Label(i, 0, titles1[i]));
			}

			for (int i = 0; i < AsCou.size(); i++) {
				String avg = String.valueOf(AsCou.get(i).getAvgScore());
				sheet1.addCell(new Label(0, i + 1, AsCou.get(i).getCouName()));
				sheet1.addCell(new Label(1, i + 1, avg));
			}
			workbook.write();
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
