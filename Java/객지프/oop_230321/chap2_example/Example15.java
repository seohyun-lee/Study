package chap2_example;
import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int price=0;
		System.out.println("어떤 커피를 주문하시겠어요?");
		String coffee = input.nextLine();
		switch(coffee) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price=3500;
				break;
			case "아메리카노":
				price=2000;
				break;
			default:
				System.out.println("메뉴에 없습니다!");
		}
		if(price!=0) System.out.println(coffee+"는 "+price+"원 입니다.");
		input.close();
	}

}
