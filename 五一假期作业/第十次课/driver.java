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
		// ����ѧ��������Ϣ
		ArrayList<StudentInfomation> StuInfo = a.InputStuInfo();
		// ����ѧ���ɼ�
		ArrayList<ScoreInfomation> ScoInfo = a.InputScore();

		// �õ�ѧ��ͳ�ƽ��
		ArrayList<StudentResult> StuRes = a.disposeStu(StuInfo, ScoInfo);

		// �õ��γ�ͳ�ƽ��
		ArrayList<CourseResult> CouRes = a.disposeCla(ScoInfo);

		// ������
		StringBuffer result = a.output(StuRes, CouRes);
		System.out.println(result);

	}
}
