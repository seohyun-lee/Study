import java.util.Scanner;

public class Practice3 {

	static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("====================================");
		System.out.println("1. 내맘대로 구구단    2. 나의 위시리스트    0. 종료");
		System.out.println("====================================");
		System.out.print("선택: ");
	}
	
	public static void myGugudan() {
		System.out.print("몇단까지 계산하여 출력할까요? ");
		int n = sc.nextInt();
		System.out.println("짝수 출력: 0, 홀수 출력: 1을 입력하세요");
		int checker=sc.nextInt();
		for (int i=1;i<=n;i++){
			for (int j=1;j<=9;j++){
				if((i*j)%2==checker)
					System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
	public static void myWishList() {
		System.out.print("내가 가지고 싶은 물건은 몇개? ");
		int n = sc.nextInt();
		
		int price, money=0;
		for(int i=0; i<n; i++) {
			System.out.printf("(%d): ", i+1);
			sc.nextLine();
			System.out.print("    가격: ");
			price=sc.nextInt();
			money+=price;
		}
		System.out.printf("필요한 총 금액은 %d원 입니다.", money);
		sc.close();
	}
	
	public static void main(String[] args) {
		int menu;
		while(true) {
			showMenu();
			menu=sc.nextInt();
			if(menu==0) break;
			else if(menu==1) myGugudan();
			else if(menu==2) myWishList();
			else System.out.println("잘못된 접근입니다.");
		}
	}

}
