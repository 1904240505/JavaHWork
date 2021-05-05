package Vo;

public class StudentInfomation {
	private String Id;// 学号
	private String Name;// 姓名
	private String Gender;// 性别

	public StudentInfomation() {
		super();
	}

	public StudentInfomation(String id, String name, String gender) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "StudentInfomation [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + "]";
	}
}
