package chap2_example;
import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = input.nextInt();
		if(score>=80) {
			System.out.println("축하합니다! 합격입니다.");
		}
		input.close();
	}

}
