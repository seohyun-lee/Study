import java.util.Scanner;

public class Practice65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyPair<String> pair1 = new MyPair<>(null, null);
		System.out.println("���ڿ��� �̷���� �������� ����ϴ�.");
		System.out.print("ù��° ���Ҹ� �Է��ϼ���: ");
		pair1.setFirst(sc.nextLine());
		System.out.print("�ι�° ���Ҹ� �Է��ϼ���: ");
		pair1.setSecond(sc.nextLine());
		System.out.println("������� ������: "+pair1.toString());
		System.out.println();
		MyPair<Integer> pair2 = new MyPair<>(null, null);
		System.out.println("���ڷ� �̷���� �������� ����ϴ�.");
		System.out.print("ù��° ���Ҹ� �Է��ϼ���: ");
		pair2.setFirst(sc.nextInt());
		System.out.print("�ι�° ���Ҹ� �Է��ϼ���: ");
		pair2.setSecond(sc.nextInt());
		System.out.print("������� ������: ");
		System.out.println("������� ������: "+pair2.toString());
		sc.close();
	}

}
