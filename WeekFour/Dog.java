package Week4;

public class Dog {
	private String name;
	private String color;
	private int age;
	private String introduce;

	public Dog() {
		name = "哈士奇";
		color = "黑与白";
		age = 3;
		introduce = "拆迁大队队长";
	}

	public Dog(String name, String color, int age, String introduce) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.introduce = introduce;
	}

	public String outputInformation() {
		String information;
		information = "dog名字：" + this.name;
		information += "\n颜色：" + this.color;
		information += "\n年龄：" + this.age;
		information += "\n信息：" + this.introduce;

		return information;
	}

	// set.get
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getIntroduce() {
		return this.introduce;
	}
}
