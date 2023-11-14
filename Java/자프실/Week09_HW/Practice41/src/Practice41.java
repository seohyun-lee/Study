import java.util.Scanner;

public class Practice41 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력: ");
		rectangle.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rectangle.height = sc.nextInt();
		System.out.println("면적은 "+rectangle.area()+"입니다.");
		System.out.println("둘레는 "+rectangle.perimeter()+"입니다.");
		sc.close();
	}

}
