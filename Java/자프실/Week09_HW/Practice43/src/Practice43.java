import java.util.Scanner;

public class Practice43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date birthday = new Date();
		Date adultday = new Date();
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		birthday.setYear(sc.nextInt());
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birthday.setMonth(sc.nextInt());
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		birthday.setDay(sc.nextInt());
		System.out.println();
		adultday.setYear(birthday.getYear() + 20);
		adultday.setMonth(birthday.getMonth());
		adultday.setDay(birthday.getDay());

		System.out.println("����� ������ "+birthday.toString()+"�Դϴ�.");
		System.out.println("����� �������� "+adultday.toString()+"�Դϴ�.");
		System.out.println("����� ������ "+birthday.toString()+"�Դϴ�.");
		sc.close();
	}

}
