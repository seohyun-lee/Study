import java.util.Scanner;

public class Practice40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date birthday = new Date();
		Date adultday = new Date();
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		birthday.year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birthday.month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		birthday.day = sc.nextInt();
		System.out.println();
		adultday.year = birthday.year + 20;
		adultday.month = birthday.month;
		adultday.day = birthday.day;

		System.out.println("����� ������ "+birthday.toString()+"�Դϴ�.");
		System.out.println("����� �������� "+adultday.toString()+"�Դϴ�.");
		System.out.println("����� ������ "+birthday.toString()+"�Դϴ�.");
		sc.close();
	}

}
