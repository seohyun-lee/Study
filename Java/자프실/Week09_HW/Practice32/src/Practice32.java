import java.util.Scanner;

public class Practice32 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		birthday.year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birthday.month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		birthday.day = sc.nextInt();
		adultday.year = birthday.year + 20;
		adultday.month = birthday.month;
		adultday.day = birthday.day;
		System.out.println("����� ������ "+birthday.year+"�� "+birthday.month+"�� "+birthday.day+"���Դϴ�.");
		System.out.println("����� �������� "+adultday.year+"�� "+adultday.month+"�� "+adultday.day+"���Դϴ�.");
		System.out.println("����� ������ "+birthday.year+"�� "+birthday.month+"�� "+birthday.day+"���Դϴ�.");
		sc.close();
	}

}
