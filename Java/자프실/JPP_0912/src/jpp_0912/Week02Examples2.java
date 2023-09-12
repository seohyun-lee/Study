package jpp_0912;

import java.util.Scanner;

public class Week02Examples2 {
	
	//if��
	public void example01() {
		int num = 10;
		
		if (num > 15) {
			System.out.println("���ڰ� 15���� Ů�ϴ�.");
		}
		System.out.println("�� ������ if�� �ܺο� �ֽ��ϴ�.");
	}
	
	//(���� 4-1) ��ǥ�� ������ ���� �Ǻ��ϱ�
	public void if01() {
		System.out.println("����� ���̸� �Է��ϼ���.");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age >= 18) {
			System.out.println("����� ���̴� 18�� �̻��Դϴ�.");
			System.out.println("����� ��ǥ�� �ڰ��� �ֽ��ϴ�.");
		}
		System.out.println("�� ������ if�� �ܺο� �ֽ��ϴ�.");
		s.close();
	}
	
	//if-else��
	public void example02() {
		int num = 120;

		if ( num < 50) {
			System.out.println("���ڰ� 50���� �۽��ϴ�.");
		}
		else {
			System.out.println("���ڰ� 50���� Ů�ϴ�.");
		}
	}
	
	//(���� 4-2) ¦��, Ȧ�� �Ǻ��ϱ�
	public void if02() {
		System.out.println("���ڸ� �Է��ϼ���.");		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();		
		if (num % 2 == 0) {
			System.out.println(num + "�� ¦���Դϴ�.");
		}
		else {
			System.out.println(num + "�� Ȧ���Դϴ�.");
		}
		System.out.println("�� ������ if�� �ܺο� �ֽ��ϴ�.");
		s.close();
	}
	
	//else if�� ����ϴ� ���ǹ�
	public void example03() {
		int num = 20;

		if (num == 10) {
			System.out.println("���ڰ� 10�Դϴ�.");
		}
		else if (num == 15) {  System.out.println("���ڰ� 15�Դϴ�.");
		}
		else if (num == 20) {
			System.out.println("���ڰ� 20�Դϴ�.");
		}
		else {
			System.out.println("���ڰ� �������� �ʽ��ϴ�.");
		}
	}
	//(���� 4-3) ������ ���� ���� �ο��ϱ�
	public void if03() {
		System.out.println("������ �Է��ϼ���.");

		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();

		if (grade >= 90) {
			System.out.println("A ����");
		}
		else if (grade >= 80) {
			System.out.println("B ����");
		}
		else if (grade >= 70) {
			System.out.println("C ����");
		}
		else if (grade >= 60) {
			System.out.println("D ����");
		}
		else {
			System.out.println("F ����");
		}
		s.close();
	}

	//��ø if~else�� ��� ����
	public void example04() {
		int num = 70;
		if (num < 100) {
			System.out.println("���ڰ� 100���� �۽��ϴ�.");
		}
		if (num > 50) {
			System.out.println("���ڰ� 50���� Ů�ϴ�.");
		}
	}
	
	//(���� 4-4) ù ��°�� �Էµ� ���� �ִ����� �Ǻ��ϱ�
	public void if04() {
		System.out.println("3���� ���ڸ� �Է��ϼ���.");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt(); 
		int z = s.nextInt();
		if (x > y) {
			if (x > z) {
				System.out.println(x +"�� ���� ū �����Դϴ�.");
			}
			else {
				System.out.println(x +"�� ���� ū ������ �ƴմϴ�.");
			}
		}
		else {
			System.out.println(x +"�� ���� ū ������ �ƴմϴ�.");
		}
		s.close();
	}
	
	//switch�� ��� ����
	public void example06() {
		char grade = 'B';
		switch (grade) {
			case 'A':
				System.out.println("�ſ� ���");
				break;
			case 'B':
				System.out.println("���");
				break;
			case 'C':
				System.out.println("����");
				break;
			case 'D':
				System.out.println("�� �� ������");
				break;
			case 'F':
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��� ���");
		}
	}
	
	//(���� 4-5) switch���� Ȱ���Ͽ� ������ ���� ���� �ο��ϱ�
	public void switch01() {
		System.out.println("������ �Է��ϼ���.");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		switch (num / 10) {
			case 10 :
			case 9 :
				System.out.println("A ����");
				break;
			case 8:
				System.out.println("B ����");
				break;
			case 7:
				System.out.println("C ����");
				break;
			case 6:
				System.out.println("D ����");
				break;
			default:
				System.out.println("F ����");
				break;
		}
		s.close();
	}

	//for�� ��� ����
	public void example07() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
	
	//(���� 4-6)�Է¹��� 5�� ������ ���ϱ�
	public void loop01() {
		int sum = 0;
		System.out.println("5���� ���ڸ� �Է��ϼ���.");
		for (int n = 1; n <= 5; n++) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			sum += num;	// sum = sum + num�� ���� �ڵ�
			s.close();
		}
		System.out.println("�հ� : " + sum);
	}
	
	//while�� ��� ����
	public void example08() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
	}

	//(���� 4-7) ¦���� Ȧ�� �Ǻ� ���� ���� Ȯ���ϱ�
	public void loop02() {
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while (choice == 1) {
			int a;
			System.out.println("���ڸ� �Է��ϼ���.");
			a = s.nextInt();
			
			if (a % 2 == 0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("Ȧ���Դϴ�.");
			}
			System.out.println("����ϰ� �ʹٸ� �� 1, �׸��ϰ� �ʹٸ� �ƴϿ� 0�� �Է��ϼ���.");
			choice = s.nextInt();
		}
		System.out.println("��� ���ڸ� Ȯ���߽��ϴ�.");
		s.close();
	}
	
	//do-while��
	public void example09() {
		int i = 1;
		do {
			System.out.println("Hello World");  i++;
		} while ( i < 6 );
	}
	
	//(���� 4-8) 10���� ū ������ 10������ �� ���ϱ�
	public void loop03() {
		Scanner s = new Scanner(System.in);
		System.out.println("10���� ū ���ڸ� �Է��ϼ���.");
		int x = s.nextInt();
		int sum = 0;
		do {
			sum += x;
			x--;
		} while (x >= 10);
		System.out.println("�հ� : " + sum);
		s.close();
	}
	
	//��ø �ݸ�
	public void example10() {
		for (int i = 2; i <= 4; i++) {
			System.out.println("������ " + i +" ��");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
	
	//�ǽ� - ��ø �ݸ� �ڵ� ������ �������� ������ ����
	public static void ninenine() {
		for (int j = 0; j <= 10; j++) {
			for (int i = 2; i <= 4; i++) {
				if (j == 0)
					System.out.print("������ " + i +" ��\t");
				else
					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.print("\n");
		}
	}
	
	//�ǽ� - (���� 4-9) ��ǥ�� ���ﰢ�� ����� ������ ������ ���
	public static void loop04() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� : ");
		int len = s.nextInt();
		//�߰��� ���ǽ� (�Ʒ��� ���ǹ� ��ȣ �� ���븸 ������)
		for (int i = len - 1; i > 0; i--) { //i�� 0�� �� �ִ� ���� ����߾����� �����ؾ� ��
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*len)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*len)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		s.close();
	}
	
	/*public static void main(String[] args) {
		//ninenine();
		loop04();
	}*/
	
	//6. ����� ���� �޼��� ����
	
	//��ȯ ������ �ִ� �޼��� | �Է�=�Ű�����, ���=��ȯ����
	
	//�Է�X ���O �޼���
	public static String example02_print() {
		return "Hi";
	}
	
	//�Է�O ���O �޼��� 
	public static int example03_add(int x, int y) {
		return x + y;
	}


	//(���� 5-2) �Ű������� ���� ��ȯ���� �ִ� �޼��� ����
	public static int method03_div( ) {
		int a = 10, b = 5;
		int result = a / b;
		return result;
	}
	
	//�Է�X ���X �޼���
	public static void example04_print() {
		System.out.println("Hi! Java");
	}
	
	//�Է�O ���X �޼���
	public static void example05_add(int x, int y) {
		System.out.println(x +"(��)�� "+ y +"�� ���� "+ (x + y) +"�Դϴ�.");
	}

	//�޼ҵ� �����ε�. �Ű������� �ڷ����̳� ������ �ٸ�. �ݵ�� �Ű������� �޶�� �����ε���.
	//
}

//�޼��� �����ε� ����
class Example06 {
	public static void calculate(int x, int y) {
		System.out.println(x * y);
	}
	public static void calculate(int x) {
		System.out.println(x * x);
	}
	public static void calculate(int x, double y) {
		System.out.println(x * y);
	}
	public static void calculate(double x) {
		System.out.println(x * x);
	}
	public static void main(String[] args) {
		calculate(2, 3);
		calculate(2, 3.14);
		calculate(2);
		calculate(2.5);
	}
}
