import java.util.Scanner;

public class Shape {
	
	static Scanner input = new Scanner(System.in); //static을 붙여야 한다
	
	public static void showMenu(int c) {
		if(c==0) {
			System.out.println("======================================================");
			System.out.println("1. 삼각형    2. 사각형    3. 크리스마스 트리    0.종료하기!");
			System.out.println("======================================================");
		}
		else {
			System.out.println("삼각형을 그립니다! 서브 메뉴를 선택하세요: ");
			System.out.println("======================================================");
			System.out.println("1. 왼쪽 직각삼각형    2. 오른쪽 직각삼각형    3. 정삼각형    0.종료하기!");
			System.out.println("======================================================");
		}
	}
	
	public static void drawLeftTriangle() {
		int h;
		System.out.print("높이: ");
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
		System.out.print("높이: ");
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
		int h, cnt;
		System.out.print("높이: ");
		h=input.nextInt();
		for(int i=0; i<h; i++) {
			cnt=2*i+1;
			for(int j=h-1; j>i; j--) {
				System.out.print(" ");
			}
			while(cnt>0){
				System.out.print("*");
				cnt--;
			}
			System.out.println();
		}
	}
	
	public static void drawSquare() {
		int w, h;
		System.out.println("사각형을 그립니다!");
		System.out.print("가로: ");
		w=input.nextInt();
		System.out.print("세로: ");
		h=input.nextInt();
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void drawChristmasTree() {
		int h;
		System.out.print("트리를 그립니다! 원하는 높이를 입력하세요: ");
		h=input.nextInt();
		
		for(int i=0;i<h;i++) {
			for(int j=h-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				if(i%5==4)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}
		
		for(int i=0; i<h/4; i++) {
			for(int j=0; j<2*(h/3); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(h/3); k++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int menu=0;
		while(true) {
			showMenu(0);
			System.out.print("메뉴: ");
			menu=input.nextInt();
			
			if(menu==0)
				break;
			else if(menu==1) {
				showMenu(1);
				System.out.print("메뉴: ");
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
