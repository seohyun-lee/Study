import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input.next()
		//input.nextInt()
		//input.nextLine()
		
		String 학번, 이름;
		int 나이;
		
		System.out.println("학번 나이 이름 순으로 한 줄로 입력하세요: ");
		학번 = input.next();
		나이 = input.nextInt();
		이름 = input.next();
		
//		System.out.print("학번: ");
//		학번 = input.nextLine();
//		
//		System.out.print("나이: ");
//		나이 = input.nextInt();
//		
//		//엔터먹어가기 용 코드 필요
//		String temp = input.nextLine();
//		
//		System.out.print("이름: ");
//		이름 = input.nextLine();
		
		System.out.println("########################");
		System.out.printf("  %s %s (%d) \n", 학번, 이름, 나이);
		System.out.println("########################");
	}

}
