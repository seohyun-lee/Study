
public class Practice35 {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		ba1.name = "����";
		ba1.accoutNo = "1234-5678";
		ba1.balance = 100;
		ba1.rate = 0.0;
		ba2.name = "ȫ�浿";
		ba2.accoutNo = "9999-2531";
		ba2.balance = 2000;
		ba2.rate = 2.15;
		System.out.println("ù ��° ���� ������ �����Դϴ�.");
		System.out.println("�̸�: "+ba1.name);
		System.out.println("���� ��ȣ: "+ba1.accoutNo);
		System.out.println("�ܾ�: "+ba1.balance+"��");
		System.out.println("������: "+ba1.rate+"%");
		System.out.println();
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.println("�̸�: "+ba2.name);
		System.out.println("���� ��ȣ: "+ba2.accoutNo);
		System.out.println("�ܾ�: "+ba2.balance+"��");
		System.out.println("������: "+ba2.rate+"%");
	}

}
