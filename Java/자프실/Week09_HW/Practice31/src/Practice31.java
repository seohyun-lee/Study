import java.util.Scanner;

public class Practice31 {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		date.year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		date.month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		date.day = sc.nextInt();
		System.out.println("����� ������ "+date.year+"�� "+date.month+"�� "+date.day+"���Դϴ�.");
		sc.close();
	}

}
