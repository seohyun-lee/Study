import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("�簢���� ���� : ");
		rectangle.setWidth(sc.nextInt());
		System.out.print("�簢���� ���� : ");
		rectangle.setHeight(sc.nextInt());
		System.out.println("�簢���� ���δ� "+rectangle.getWidth()+"�̰�, ���δ� "+rectangle.getHeight()+"�Դϴ�.");
		System.out.println("�簢���� ���̴� "+rectangle.area()+"�̰�, �ѷ��� "+rectangle.perimeter()+"�Դϴ�.");
		sc.close();
	}

}
