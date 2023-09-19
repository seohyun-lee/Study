import java.util.Scanner;

//예제16: break 사용
public class 예제16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt = 0;
		double average = 0;
		while (true) {
			System.out.print("정수를 입력하시오: ");
			num = sc.nextInt();
			if (num == -1)
				break;
			cnt++;
			average += num;
		}
		if (cnt != 0)
		{
			average /= cnt;
			System.out.println("평균은 " + average);
		}
	}

}
