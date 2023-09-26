import java.util.Scanner;

//예제9: 피자 가격 변환
public class 예제09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피자 종류를 입력하시오: ");
		String pizza = sc.nextLine();
		int price;
		switch(pizza) {
			case "콤비네이션", "슈퍼슈프림":
				price = 20000;
				break;
			case "포테이토":
				price = 15000;
				break;
			case "쉬림프":
				price = 25000;
				break;
			default:
				price = 0;
		}
		System.out.print("피자 " + pizza + "의 가격=" + price);
		sc.close();
	}

}
