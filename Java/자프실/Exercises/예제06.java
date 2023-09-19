import java.util.Scanner;

//예제6: 짝수와 홀수 구별하기
public class 예제06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
		sc.close();
	}

}
