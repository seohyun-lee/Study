import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� �Է��Ͻÿ�");
			int dividend = sc.nextInt();
			System.out.println("������ �Է��Ͻÿ�");
			int divisor = sc.nextInt();
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) { // ArithmeticException ���� ó�� �ڵ�
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		sc.close();
	}

}
