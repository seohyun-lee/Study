import java.util.Scanner;

//예제1: 사용자로부터 입력받은 두 수를 받아서 더하기
public class 예제01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하시오: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하시오: ");
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);
		sc.close();
	}

}