import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input.next()
		//input.nextInt()
		//input.nextLine()
		
		String �й�, �̸�;
		int ����;
		
		System.out.println("�й� ���� �̸� ������ �� �ٷ� �Է��ϼ���: ");
		�й� = input.next();
		���� = input.nextInt();
		�̸� = input.next();
		
//		System.out.print("�й�: ");
//		�й� = input.nextLine();
//		
//		System.out.print("����: ");
//		���� = input.nextInt();
//		
//		//���͸Ծ�� �� �ڵ� �ʿ�
//		String temp = input.nextLine();
//		
//		System.out.print("�̸�: ");
//		�̸� = input.nextLine();
		
		System.out.println("########################");
		System.out.printf("  %s %s (%d) \n", �й�, �̸�, ����);
		System.out.println("########################");
	}

}
