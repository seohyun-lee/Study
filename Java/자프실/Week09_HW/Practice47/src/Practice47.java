
public class Practice47 {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		ba1.setName("±èµ¿´ö");
		ba1.setAccoutNo("1234-5678");
		ba1.setBalance(100);
		ba1.setRate(0.0);
		ba2.setName("È«±æµ¿");
		ba2.setAccoutNo("9999-2531");
		ba2.setBalance(2000);
		ba2.setRate(2.15);
		System.out.println(ba1.toString()+"\n");
		System.out.println(ba2.toString());
	}

}
