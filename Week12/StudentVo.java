package Week12;

public class StudentVo {
	private String Id;
	private String Name;
	private String Gender;

	public StudentVo() {
		super();
	}

	public StudentVo(String id, String name, String gender) {
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
		String msg = "";
		msg += this.Id + "," + this.Name + "," + this.Gender;
		return msg;
	}

}
