package Vo;

public class StudentInfomation {
	private String Id;// ѧ��
	private String Name;// ����
	private String Gender;// �Ա�

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
