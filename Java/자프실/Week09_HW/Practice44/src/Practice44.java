import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ����� �����ϼ���(1-����, 2-�Ǽ�): ");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.print("��հ��� ���ϴ� ������ ������ �Է��ϼ���: ");
			int n1 = sc.nextInt();
			if (n1 == 2) {
				System.out.print("1�� ������ �Է��ϼ���: ");
				int a = sc.nextInt();
				System.out.print("2�� ������ �Է��ϼ���: ");
				int b = sc.nextInt();
				System.out.println("2�� ������ ����� "+Average.getAverage(a, b)+"�Դϴ�.");
			}
			else {
				System.out.print("1�� ������ �Է��ϼ���: ");
				int a = sc.nextInt();
				System.out.print("2�� ������ �Է��ϼ���: ");
				int b = sc.nextInt();
				System.out.print("3�� ������ �Է��ϼ���: ");
				int c = sc.nextInt();
				System.out.println("3�� ������ ����� "+Average.getAverage(a, b, c)+"�Դϴ�.");
			}
		} else {
			System.out.print("��հ��� ���ϴ� �Ǽ��� ������ �Է��ϼ���: ");
			int n1 = sc.nextInt();
			if (n1 == 2) {
				System.out.print("1�� �Ǽ��� �Է��ϼ���: ");
				double a = sc.nextDouble();
				System.out.print("2�� �Ǽ��� �Է��ϼ���: ");
				double b = sc.nextDouble();
				System.out.println("2�� �Ǽ��� ����� "+Average.getAverage(a, b)+"�Դϴ�.");
			}
			else {
				System.out.print("1�� �Ǽ��� �Է��ϼ���: ");
				double a = sc.nextDouble();
				System.out.print("2�� �Ǽ��� �Է��ϼ���: ");
				double b = sc.nextDouble();
				System.out.print("3�� �Ǽ��� �Է��ϼ���: ");
				double c = sc.nextDouble();
				System.out.println("3�� �Ǽ��� ����� "+Average.getAverage(a, b, c)+"�Դϴ�.");
			}
		}
		sc.close();
	}

}
