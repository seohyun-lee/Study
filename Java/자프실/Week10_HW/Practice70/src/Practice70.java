import java.util.Scanner;

public class Practice70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ RandomList�� �����մϴ�.");
		RandomList<Integer> rl1 = new RandomList<>();
		int size;
		System.out.print("����Ʈ�� ũ�⸦ �Է��ϼ���: ");
		size = sc.nextInt();
		for(int i=0; i<size; i++) {
			System.out.print("�߰��ϰ� ���� ������ �Է��ϼ���: ");
			rl1.add(sc.nextInt());
		}
		System.out.println();
		System.out.println("����Ʈ�� ������ ����մϴ�.");
		rl1.print();
		System.out.println("������ ���� ��� : "+rl1.select());
		System.out.println();
		
		RandomList<String> rl2 = new RandomList<>();
		System.out.println("���ڿ� RandomList�� �����մϴ�.");
		System.out.print("����Ʈ�� ũ�⸦ �Է��ϼ���: ");
		size = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<size; i++) {
			System.out.print("�߰��ϰ� ���� ���ڿ��� �Է��ϼ���: ");
			rl2.add(sc.nextLine());
		}
		System.out.println();
		System.out.println("����Ʈ�� ������ ����մϴ�.");
		rl2.print();
		System.out.println("������ ���� ��� : "+rl2.select());
		sc.close();
	}

}
