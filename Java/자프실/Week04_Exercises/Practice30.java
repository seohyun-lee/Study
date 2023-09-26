import java.util.Scanner;

public class Practice30 {

	public static void displayArray(int[] iArray) {
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static int findMax(int[] iArray) {
		int max = iArray[0];
		for (int i = 1; i < iArray.length; i++) {
			if (iArray[i] > max)
				max = iArray[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
			num[i] = sc.nextInt();
		}
		System.out.println("입력된 숫자는 다음과 같습니다.");
		displayArray(num);
		System.out.println("가장 큰 수는 " + findMax(num) + "입니다.");
		sc.close();
	}

}
