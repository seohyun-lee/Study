import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 기능을 선택하세요(1-정수, 2-실수): ");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.print("평균값을 원하는 정수의 개수를 입력하세요: ");
			int n1 = sc.nextInt();
			if (n1 == 2) {
				System.out.print("1번 정수를 입력하세요: ");
				int a = sc.nextInt();
				System.out.print("2번 정수를 입력하세요: ");
				int b = sc.nextInt();
				System.out.println("2개 정수의 평균은 "+Average.getAverage(a, b)+"입니다.");
			}
			else {
				System.out.print("1번 정수를 입력하세요: ");
				int a = sc.nextInt();
				System.out.print("2번 정수를 입력하세요: ");
				int b = sc.nextInt();
				System.out.print("3번 정수를 입력하세요: ");
				int c = sc.nextInt();
				System.out.println("3개 정수의 평균은 "+Average.getAverage(a, b, c)+"입니다.");
			}
		} else {
			System.out.print("평균값을 원하는 실수의 개수를 입력하세요: ");
			int n1 = sc.nextInt();
			if (n1 == 2) {
				System.out.print("1번 실수를 입력하세요: ");
				double a = sc.nextDouble();
				System.out.print("2번 실수를 입력하세요: ");
				double b = sc.nextDouble();
				System.out.println("2개 실수의 평균은 "+Average.getAverage(a, b)+"입니다.");
			}
			else {
				System.out.print("1번 실수를 입력하세요: ");
				double a = sc.nextDouble();
				System.out.print("2번 실수를 입력하세요: ");
				double b = sc.nextDouble();
				System.out.print("3번 실수를 입력하세요: ");
				double c = sc.nextDouble();
				System.out.println("3개 실수의 평균은 "+Average.getAverage(a, b, c)+"입니다.");
			}
		}
		sc.close();
	}

}
