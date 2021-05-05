package ��11�ο�;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ������ {
	public static void main(String[] args) {
		String data = "<html><head><title>��ӭ�����人��֯��ѧ��ҳ</title></head></html>";
		data += "<body><img src='1.jpg'/>";
		data += "<a href='1.htm'>��ҳ</a>";
		data += "<a href='2.htm'>����</a>";
		data += "<a href='3.htm'>����ѧԺ</a>";
		data += "<img src='2.jpg'/>";
		data += "<img src='3.jpg'/></body></html>";

		Pattern title = Pattern.compile("(<title>)(.*?)(</title>)", Pattern.CASE_INSENSITIVE);// ����
		Matcher Title = title.matcher(data);

		Pattern picture = Pattern.compile("(<img)(.*?)(/>)", Pattern.CASE_INSENSITIVE);// ͼƬģʽ
		Matcher Picture = picture.matcher(data);

		Pattern hyper = Pattern.compile("(<a)(.*?)(/a>)", Pattern.CASE_INSENSITIVE);// ������ģʽ
		Matcher Hyper = hyper.matcher(data);

		String tit = new String();// ����
		ArrayList<String> pic = new ArrayList<String>();// ͼƬ��
		ArrayList<String> hyp = new ArrayList<String>();// ��������
		ArrayList<String> address = new ArrayList<String>();// �����ӵ�ַ
		int countpic = 0;
		int counthyp = 0;

		// ����
		if (Title.find()) {
			tit = Title.group(2);
		}

		// ͼƬ�ļ���
		while (Picture.find()) {
			countpic++;
			String p = Picture.group(2);
			Pattern picture2 = Pattern.compile("(src=)(\'|\")(.*?)(\'|\")", Pattern.CASE_INSENSITIVE);// ͼƬ��
			Matcher Picture2 = picture2.matcher(p);
			if (Picture2.find()) {
				pic.add(Picture2.group(3));
			}
		}

		// �����������Լ���ַ
		while (Hyper.find()) {
			counthyp++;
			String H = Hyper.group(2);
			Pattern hyper2 = Pattern.compile("(href=)(\'|\")(.*?)(\'|\")", Pattern.CASE_INSENSITIVE);// ��ַ
			Matcher Hyper2 = hyper2.matcher(H);
			Pattern hyper3 = Pattern.compile("(\'>)(.*?)(<)", Pattern.CASE_INSENSITIVE);// ����
			Matcher Hyper3 = hyper3.matcher(H);
			if (Hyper2.find()) {
				address.add(Hyper2.group(3));
			}
			if (Hyper3.find()) {
				hyp.add(Hyper3.group(2));
			}
		}

		// ���
		System.out.println("��ҳ���⣺" + tit);
		System.out.print("��ҳ�й�" + countpic + "��ͼƬ���ļ���Ϊ");
		for (int i = 0; i < pic.size(); i++) {
			System.out.print(pic.get(i) + " ");
		}
		System.out.println("\n��ҳ�а���" + counthyp + "�������ӣ���������Ϣ���£�");
		System.out.println("����\t\t��ַ");
		for (int i = 0; i < hyp.size(); i++) {
			System.out.println(hyp.get(i) + "\t\t" + address.get(i));
		}
	}
}
