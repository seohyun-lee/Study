import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		Rectangle rtg1 = new Rectangle();
		Rectangle rtg2 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° �簢���� ������ �Է��ϼ���.");
		System.out.print("���� �Է�: ");
		rtg1.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		rtg1.height = sc.nextInt();
		System.out.println("�� ��° �簢���� ������ �Է��ϼ���.");
		System.out.print("���� �Է�: ");
		rtg2.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		rtg2.height = sc.nextInt();
		
		System.out.println("\nù ��° �簢���� ������ "+rtg1.height*rtg1.width+"�Դϴ�.");
		System.out.println("ù ��° �簢���� �ѷ��� "+(rtg1.height+rtg1.width)*2+"�Դϴ�.");
		System.out.println("\n�� ��° �簢���� ������ "+rtg2.height*rtg2.width+"�Դϴ�.");
		System.out.println("�� ��° �簢���� �ѷ��� "+(rtg2.height+rtg2.width)*2+"�Դϴ�.");
		sc.close();
	}

}
