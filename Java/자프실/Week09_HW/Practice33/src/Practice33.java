import java.util.Scanner;

public class Practice33 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		rectangle.width = sc.nextInt();
		System.out.print("���� �Է�: ");
		rectangle.height = sc.nextInt();
		System.out.println("������ "+rectangle.height*rectangle.width+"�Դϴ�.");
		System.out.println("�ѷ��� "+(rectangle.height+rectangle.width)*2+"�Դϴ�.");
		sc.close();
	}

}
