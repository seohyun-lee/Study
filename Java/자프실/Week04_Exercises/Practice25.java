import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i += 3) {
			System.out.print(i + "\t");
			if ((i + 3) % 5 == 0)
				System.out.println();
		}
		sc.close();
	}

}
