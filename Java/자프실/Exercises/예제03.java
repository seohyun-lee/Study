import java.util.Scanner;

//예제3: 형변환 실습하기
public class 예제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하시오: ");
		int time = sc.nextInt();
		int min = time / 60;
		int sec = time % 60;
		System.out.println(time + "초는 " + min + "분 " + sec + "초입니다.");
		sc.close();
	}
	
}
