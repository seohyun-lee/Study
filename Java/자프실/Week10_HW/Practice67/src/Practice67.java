import java.util.Scanner;

public class Practice67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sArray = {"�ϳ�", "�ο�", "����"};
		Integer[] iArray = {10, 20, 30, 40};
		int index;
		
		System.out.println("String[] sArray = {���ϳ���, ���ο, ��������};");
		System.out.println("Integer[] iArray = {10, 20, 30, 40};");
		System.out.println();
		System.out.println("���ڿ� �迭�� �����Դϴ�.");
		MyArray.displayArray(sArray);
		System.out.println();
		
		for(int i=0; i<2; i++) {
			System.out.print("���ڿ� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
			index = sc.nextInt();
			System.out.print(index+"�� �ε��� ���� ���� : ");
			System.out.println(MyArray.pick(sArray, index));
		}
		System.out.println();
		
		System.out.print("0�� �ε����� ����� ���� ��ȯ�ϰ� ���� �ε����� �����ϼ���: ");
		index = sc.nextInt();
		System.out.println("���� �� ���ڿ� �迭");
		MyArray.swap(sArray, 0, index);
		MyArray.displayArray(sArray);
		System.out.println();
		
		System.out.println("������ �迭�� �����Դϴ�.");
		MyArray.displayArray(iArray);
		System.out.println();

		for(int i=0; i<2; i++) {
			System.out.print("���� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
			index = sc.nextInt();
			System.out.print(index+"�� �ε��� ���� ���� : ");
			System.out.println(MyArray.pickNew(iArray, index));
		}
		sc.close();
	}

}
