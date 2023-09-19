import java.util.Scanner;

//예제5: 온도 변환 프로그램
public class 예제05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("1.  화씨 -> 섭씨");
		System.out.println("2.  섭씨 -> 화씨");
		System.out.println("=====================================");
		System.out.print("번호를 선택하시오: ");
		int num = sc.nextInt();
		double tmp;
		if (num == 1) {
			System.out.print("화씨온도를 입력하시오: ");
			tmp = sc.nextDouble();
			tmp = (tmp - 32) / 1.8;
			System.out.print("섭씨온도는 " + tmp);
		}
		else {
			System.out.print("섭씨온도를 입력하시오: ");
			tmp = sc.nextDouble();
			tmp = tmp * 1.8 - 32;
			System.out.print("화씨온도는 " + tmp);
		}
		sc.close();
	}

}
