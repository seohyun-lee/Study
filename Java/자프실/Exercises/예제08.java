import java.util.Scanner;

//예제8: 학점 결정
public class 예제08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		switch(score/10) {
			case 9, 10:
				System.out.println("학점 A");
				break;
			case 8:
				System.out.println("학점 B");
				break;
			case 7:
				System.out.println("학점 C");
				break;
			default:
				System.out.println("학점 F");
		}
		sc.close();
	}

}
