import java.util.Scanner;

public class Welcome {

	private static void showMenu(String[] msg) {
		String s1 = "Welcome to Shopping Mall";
		String s2 = "Welcome to Book Market!";
		System.out.println("*********************************************");
		System.out.println("\t" + s1); //인사말을 변수에 저장하여 출력
		System.out.println("\t" + s2);
		System.out.println("*********************************************");
		System.out.println(" " + msg[1] + "\t" + msg[4]);
		System.out.println(" " + msg[2] + "\t" + msg[5]);
		System.out.println(" " + msg[3] + "\t\t" + msg[6]);
		System.out.println(" " + msg[7] + "\t\t" + msg[8]);
		System.out.println("*********************************************");
		System.out.print(msg[0]);
	}
	
	private static void showCustomerInfo(String userName, int phoneNumber) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 "+ userName + "\t\t연락처 " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = input.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		int phoneNumber = input.nextInt();
		String[] msg = {"메뉴 번호를 선택해주세요 ", "1. 고객 정보 확인하기", "2. 장바구니 상품 목록 보기", "3. 장바구니 비우기",
				"4. 바구니에 항목 추가하기", "5. 장바구니의 항목 수량 줄이기", "6. 장바구니의 항목 삭제하기",
				"7. 영수증 표시하기", "8. 종료"};
		while(true)
		{
			showMenu(msg);
			int n = input.nextInt();
			switch(n) {
				case 1:
					showCustomerInfo(userName, phoneNumber);
					break;
				case 8:
					System.out.println(msg[n]);
					break;
				case 2, 3, 4, 5, 6, 7:
					System.out.println(msg[n] + " : ");
					break;
				default:
					System.out.println("잘못된 입력입니다.");
			}
			if (n == 8)
				break;
		}
		input.close();
	}
}
