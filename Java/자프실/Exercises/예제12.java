import java.util.Scanner;

//예제12: 팩토리얼 계산하기
public class 예제12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int n = sc.nextInt();
		long result = 1;
		if (n < 0)
			System.out.println("음의 정수는 팩토리얼을 계산할 수 없습니다.");
		else {
			for (int i = 1; i <= n; i++)
				result *= i;
			System.out.println(n + "!은 " + result + "입니다.");
		}
		sc.close();
	}

}
