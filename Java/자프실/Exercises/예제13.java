import java.util.Scanner;

//예제13: 약수 계산하기
public class 예제13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num + "의 약수는 다음과 같습니다.");
			for (int i = 1; i <= num; i++)
				if (num % i == 0)
					System.out.print(i + " ");
		}
		else
			System.out.println("양의 약수를 입력하지 않았습니다.");
		sc.close();
	}

}
