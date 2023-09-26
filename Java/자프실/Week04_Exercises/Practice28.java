import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("입력된 숫자는 다음과 같습니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("역순 출력입니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[4 - i] + " ");
		}
		System.out.println();
		System.out.println("가장 큰 수는 " + max + "입니다.");
		sc.close();
	}

}
