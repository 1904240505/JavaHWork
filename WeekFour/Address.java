package Week4;

public class Address {
	// �������
	private String guojia;
	private String shengfen;
	private String chengshi;
	private String jiedao;
	private String youbian;

	public Address() {
		guojia = "�й�";
		shengfen = "����ʡ";
		chengshi = "�人��";
		jiedao = "������";
		youbian = "123456";
	}
	
	public Address(String guojia,String shengfen,String chengshi,String jiedao,String youbian) {
		this.guojia = guojia;
		this.shengfen = shengfen;
		this.chengshi = chengshi;
		this.jiedao = jiedao;
		this.youbian =youbian;
	}

	// set//get
	public void setGuojia(String guojia) {
		this.guojia = guojia;
	}

	public String getGuojia() {
		return this.guojia;
	}

	public void setShengfen(String shengfen) {
		this.shengfen = shengfen;
	}

	public String getShengfen() {
		return this.shengfen;
	}

	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}

	public String getChengshi() {
		return this.chengshi = chengshi;
	}

	public void setJiedao(String jiedao) {
		this.jiedao = jiedao;
	}

	public String getJiedao() {
		return this.jiedao = jiedao;
	}

	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}

	public String getYoubian() {
		return this.youbian;
	}

	//
	public String getAddress() {
		String address;
		address = this.guojia;
		address += "-" + this.shengfen;
		address += "-" + this.chengshi;
		address += "-" + this.jiedao;
		address += "-" + this.youbian;

		return address;
	}

}
