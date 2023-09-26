import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int min;
		System.out.print("첫 번째 숫자를 입력하세요: ");
		min = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		input = sc.nextInt();
		if (min > input)
			min = input;
		System.out.print("세 번째 숫자를 입력하세요: ");
		input = sc.nextInt();
		if (min > input)
			min = input;
		System.out.println("가장 작은 숫자는 " + min + "입니다.");
		sc.close();
	}

}
