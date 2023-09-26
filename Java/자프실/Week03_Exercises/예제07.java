import java.util.Scanner;

//예제7: 학점 결정
public class 예제07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		if (score >= 90)
			System.out.println("학점 A");
		else if (score >= 80)
			System.out.println("학점 B");
		else if (score >= 70)
			System.out.println("학점 C");
		else
			System.out.println("학점 F");
		sc.close();
	}

}
