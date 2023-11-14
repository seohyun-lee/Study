import java.util.Scanner;

public class Practice65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyPair<String> pair1 = new MyPair<>(null, null);
		System.out.println("문자열로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫번째 원소를 입력하세요: ");
		pair1.setFirst(sc.nextLine());
		System.out.print("두번째 원소를 입력하세요: ");
		pair1.setSecond(sc.nextLine());
		System.out.println("만들어진 순서쌍: "+pair1.toString());
		System.out.println();
		MyPair<Integer> pair2 = new MyPair<>(null, null);
		System.out.println("숫자로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫번째 원소를 입력하세요: ");
		pair2.setFirst(sc.nextInt());
		System.out.print("두번째 원소를 입력하세요: ");
		pair2.setSecond(sc.nextInt());
		System.out.print("만들어진 순서쌍: ");
		System.out.println("만들어진 순서쌍: "+pair2.toString());
		sc.close();
	}

}
