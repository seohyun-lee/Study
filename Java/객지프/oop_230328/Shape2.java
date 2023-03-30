import java.util.Scanner;

public class Shape2 {
	static Scanner input = new Scanner(System.in); //static�� �ٿ��� �Ѵ�
	
	public static void showMenu(int c) {
		if(c==0) {
			System.out.println("======================================================");
			System.out.println("1. �ﰢ��    2. �簢��    3. ũ�������� Ʈ��    0.�����ϱ�!");
			System.out.println("======================================================");
		}
		else {
			System.out.println("�ﰢ���� �׸��ϴ�! ���� �޴��� �����ϼ���: ");
			System.out.println("======================================================");
			System.out.println("1. ���� �����ﰢ��    2. ������ �����ﰢ��    3. ���ﰢ��    0.�����ϱ�!");
			System.out.println("======================================================");
		}
	}
	public static void drawLeftTriangle() {
		int h;
		System.out.print("����: ");
		h=input.nextInt();
		for(int i=0; i<h; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void drawRightTriangle() {
		int h;
		System.out.print("����: ");
		h=input.nextInt();
		for(int i=0; i<h; i++) {
			for(int j=h-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void drawEquilateralTriangle() {
		int h;
		System.out.print("����: ");
		h=input.nextInt();
		for(int i=0; i<h; i++) {
			for(int j=h-1; j>i; j--) {
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++) {
				if(i%2==0) System.out.print("�� ");
				else System.out.print("�� ");
			}
			System.out.println();
		}
	}
	
	public static void drawSquare() {
		int w, h;
		System.out.println("�簢���� �׸��ϴ�!");
		System.out.print("����: ");
		w=input.nextInt();
		System.out.print("����: ");
		h=input.nextInt();
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void drawChristmasTree() {
		int h;
		System.out.print("Ʈ���� �׸��ϴ�! ���ϴ� ���̸� �Է��ϼ���: ");
		h=input.nextInt();
		
		for(int i=0;i<h;i++) {
			for(int j=h-1; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++) {
				if(i%5==4)
					System.out.print("�� ");
				else
					System.out.print("�� ");
			}
			System.out.println();
		}
		
		for(int i=0; i<h/4; i++) {
			for(int j=0; j<2*(h/3); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(h/3); k++) {
				System.out.print("�� ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int menu=0;
		while(true) {
			showMenu(0);
			System.out.print("�޴�: ");
			menu=input.nextInt();
			
			if(menu==0)
				break;
			else if(menu==1) {
				showMenu(1);
				System.out.print("�޴�: ");
				menu=input.nextInt();
				
				if(menu==0)
					break;
				else if (menu==1)
					drawLeftTriangle();
				else if (menu==2)
					drawRightTriangle();
				else
					drawEquilateralTriangle();
			}
			else if(menu==2)
				drawSquare();
			else if(menu==3)
				drawChristmasTree();
		}
		input.close();
	}
}
