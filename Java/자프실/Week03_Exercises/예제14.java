import java.util.Scanner;

//예제14: -1의 값이 입력될 때까지 합계 계산하기
public class 예제14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int result = 0;
		while (true) {
			System.out.print("정수를 입력하시오: ");
			num = sc.nextInt();
			if (num == -1)
				break;
			result += num;
		}
		System.out.println("정수의 합은 " + result + "입니다.");
	}

}
