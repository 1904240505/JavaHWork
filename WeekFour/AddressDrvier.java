package Week4;

public class AddressDrvier {
	public static void main(String[] args) {
		Address a1 = new Address();
		Address a2 = new Address("����","��ʢ��","ŦԼ","�����մ��","852963");

		System.out.println(a1.getAddress());
		System.out.println(a2.getAddress());
		a2.setGuojia("�й�");
		System.out.println(a2.getAddress());
	}

}
