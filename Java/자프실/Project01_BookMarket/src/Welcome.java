import java.util.Scanner;

public class Welcome {

	private static void showMenu() {
		String s1 = "Welcome to Shopping Mall";
		String s2 = "Welcome to Book Market!";
		System.out.println("*******************************************");
		System.out.println("\t" + s1); //인사말을 변수에 저장하여 출력
		System.out.println("\t" + s2);
		System.out.println("*******************************************");
		System.out.println(" 1. 고객 정보 확인하기      4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기  5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기        6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기        8. 종료");
		System.out.println("*******************************************");
		System.out.print("메뉴 번호를 선택해주세요 ");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = input.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		int phoneNumber = input.nextInt();
		showMenu();
		int n = input.nextInt();
		System.out.println(n + "번을 선택했습니다");
		input.close();
	}
}
