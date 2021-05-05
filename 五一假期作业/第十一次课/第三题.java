package 第11次课;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 第三题 {
	public static void main(String[] args) {
		String data = "<html><head><title>欢迎访问武汉纺织大学主页</title></head></html>";
		data += "<body><img src='1.jpg'/>";
		data += "<a href='1.htm'>首页</a>";
		data += "<a href='2.htm'>教务处</a>";
		data += "<a href='3.htm'>数计学院</a>";
		data += "<img src='2.jpg'/>";
		data += "<img src='3.jpg'/></body></html>";

		Pattern title = Pattern.compile("(<title>)(.*?)(</title>)", Pattern.CASE_INSENSITIVE);// 标题
		Matcher Title = title.matcher(data);

		Pattern picture = Pattern.compile("(<img)(.*?)(/>)", Pattern.CASE_INSENSITIVE);// 图片模式
		Matcher Picture = picture.matcher(data);

		Pattern hyper = Pattern.compile("(<a)(.*?)(/a>)", Pattern.CASE_INSENSITIVE);// 超链接模式
		Matcher Hyper = hyper.matcher(data);

		String tit = new String();// 标题
		ArrayList<String> pic = new ArrayList<String>();// 图片名
		ArrayList<String> hyp = new ArrayList<String>();// 超链接名
		ArrayList<String> address = new ArrayList<String>();// 超链接地址
		int countpic = 0;
		int counthyp = 0;

		// 标题
		if (Title.find()) {
			tit = Title.group(2);
		}

		// 图片文件名
		while (Picture.find()) {
			countpic++;
			String p = Picture.group(2);
			Pattern picture2 = Pattern.compile("(src=)(\'|\")(.*?)(\'|\")", Pattern.CASE_INSENSITIVE);// 图片名
			Matcher Picture2 = picture2.matcher(p);
			if (Picture2.find()) {
				pic.add(Picture2.group(3));
			}
		}

		// 超链接名称以及地址
		while (Hyper.find()) {
			counthyp++;
			String H = Hyper.group(2);
			Pattern hyper2 = Pattern.compile("(href=)(\'|\")(.*?)(\'|\")", Pattern.CASE_INSENSITIVE);// 地址
			Matcher Hyper2 = hyper2.matcher(H);
			Pattern hyper3 = Pattern.compile("(\'>)(.*?)(<)", Pattern.CASE_INSENSITIVE);// 名称
			Matcher Hyper3 = hyper3.matcher(H);
			if (Hyper2.find()) {
				address.add(Hyper2.group(3));
			}
			if (Hyper3.find()) {
				hyp.add(Hyper3.group(2));
			}
		}

		// 输出
		System.out.println("网页标题：" + tit);
		System.out.print("网页中共" + countpic + "个图片，文件名为");
		for (int i = 0; i < pic.size(); i++) {
			System.out.print(pic.get(i) + " ");
		}
		System.out.println("\n网页中包含" + counthyp + "个超链接，超链接信息如下：");
		System.out.println("名称\t\t地址");
		for (int i = 0; i < hyp.size(); i++) {
			System.out.println(hyp.get(i) + "\t\t" + address.get(i));
		}
	}
}
