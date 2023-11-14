import java.util.Scanner;

public class Practice31 {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요: ");
		date.year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		date.month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		date.day = sc.nextInt();
		System.out.println("당신의 생일은 "+date.year+"년 "+date.month+"월 "+date.day+"일입니다.");
		sc.close();
	}

}
