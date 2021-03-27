package Week4;

public class AddressDrvier {
	public static void main(String[] args) {
		Address a1 = new Address();
		Address a2 = new Address("美国","华盛顿","纽约","特朗普大道","852963");

		System.out.println(a1.getAddress());
		System.out.println(a2.getAddress());
		a2.setGuojia("中国");
		System.out.println(a2.getAddress());
	}

}
