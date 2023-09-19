import java.util.Scanner;

public class Welcome {

	private static void showMenu(String[] msg) {
		String s1 = "Welcome to Shopping Mall";
		String s2 = "Welcome to Book Market!";
		System.out.println("*********************************************");
		System.out.println("\t" + s1); //�λ縻�� ������ �����Ͽ� ���
		System.out.println("\t" + s2);
		System.out.println("*********************************************");
		System.out.println(" " + msg[1] + "\t" + msg[4]);
		System.out.println(" " + msg[2] + "\t" + msg[5]);
		System.out.println(" " + msg[3] + "\t\t" + msg[6]);
		System.out.println(" " + msg[7] + "\t\t" + msg[8]);
		System.out.println("*********************************************");
		System.out.print(msg[0]);
	}
	
	private static void showCustomerInfo(String userName, int phoneNumber) {
		System.out.println("���� �� ���� : ");
		System.out.println("�̸� "+ userName + "\t\t����ó " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String userName = input.nextLine();
		System.out.print("����ó�� �Է��ϼ��� : ");
		int phoneNumber = input.nextInt();
		String[] msg = {"�޴� ��ȣ�� �������ּ��� ", "1. �� ���� Ȯ���ϱ�", "2. ��ٱ��� ��ǰ ��� ����", "3. ��ٱ��� ����",
				"4. �ٱ��Ͽ� �׸� �߰��ϱ�", "5. ��ٱ����� �׸� ���� ���̱�", "6. ��ٱ����� �׸� �����ϱ�",
				"7. ������ ǥ���ϱ�", "8. ����"};
		while(true)
		{
			showMenu(msg);
			int n = input.nextInt();
			switch(n) {
				case 1:
					showCustomerInfo(userName, phoneNumber);
					break;
				case 8:
					System.out.println(msg[n]);
					break;
				case 2, 3, 4, 5, 6, 7:
					System.out.println(msg[n] + " : ");
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
			}
			if (n == 8)
				break;
		}
		input.close();
	}
}
