import java.util.Scanner;

//예제2: 사용자로부터 이름과 나이를 받는 프로그램
public class 예제02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		System.out.println(name + "님 안녕하세요! " + age +"살이시네요.");
		sc.close();
	}

}
