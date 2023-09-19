import java.util.Scanner;

//예제15: 정확한 입력받기
public class 예제15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		while (true) {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = sc.nextInt();
			if (month > 0 && month < 13)
				break;
		}
		System.out.println("사용자가 입력한 월은 " + month);
	}

}
