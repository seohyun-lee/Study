import java.util.Scanner;

public class Practice39 {

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

		System.out.print("����� ������ ");
		birthday.print();
		System.out.print("����� �������� ");
		adultday.print();
		System.out.print("����� ������ ");
		birthday.print();
		sc.close();
	}

}
