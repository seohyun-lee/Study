import java.util.Scanner;

public class Welcome {

	private static void showMenu() {
		String s1 = "Welcome to Shopping Mall";
		String s2 = "Welcome to Book Market!";
		System.out.println("*******************************************");
		System.out.println("\t" + s1); //�λ縻�� ������ �����Ͽ� ���
		System.out.println("\t" + s2);
		System.out.println("*******************************************");
		System.out.println(" 1. �� ���� Ȯ���ϱ�      4. �ٱ��Ͽ� �׸� �߰��ϱ�");
		System.out.println(" 2. ��ٱ��� ��ǰ ��� ����  5. ��ٱ����� �׸� ���� ���̱�");
		System.out.println(" 3. ��ٱ��� ����        6. ��ٱ����� �׸� �����ϱ�");
		System.out.println(" 7. ������ ǥ���ϱ�        8. ����");
		System.out.println("*******************************************");
		System.out.print("�޴� ��ȣ�� �������ּ��� ");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String userName = input.nextLine();
		System.out.print("����ó�� �Է��ϼ��� : ");
		int phoneNumber = input.nextInt();
		showMenu();
		int n = input.nextInt();
		System.out.println(n + "���� �����߽��ϴ�");
		input.close();
	}
}
