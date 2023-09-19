import java.util.Scanner;

//예제19: 숫자 추측 게임
public class 예제19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random() * 100); //0~99
		int input;
		int count = 0;
		while(true) {
			System.out.print("정답을 추측하여 보시오: ");
			input = sc.nextInt();
			count++;
			if (input < answer)
				System.out.println("제시한 정수가 낮습니다.");
			else if (input > answer)
				System.out.println("제시한 정수가 높습니다.");
			else
				break;
		}
		System.out.println("축하합니다. 시도횟수=" + count);
	}

}
