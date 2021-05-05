package Driver;

import java.util.ArrayList;
import java.util.Scanner;

import Vo.CourseResult;
import Vo.CourseTotal;
import Vo.ScoreInfomation;
import Vo.StudentInfomation;
import Vo.StudentResult;
import Dao.function_dao;

public class driver {
	public static void main(String[] args) {

		function_dao a = new function_dao();
		// 输入学生基本信息
		ArrayList<StudentInfomation> StuInfo = a.InputStuInfo();
		// 输入学生成绩
		ArrayList<ScoreInfomation> ScoInfo = a.InputScore();

		// 得到学生统计结果
		ArrayList<StudentResult> StuRes = a.disposeStu(StuInfo, ScoInfo);

		// 得到课程统计结果
		ArrayList<CourseResult> CouRes = a.disposeCla(ScoInfo);

		// 输出结果
		StringBuffer result = a.output(StuRes, CouRes);
		System.out.println(result);

	}
}
