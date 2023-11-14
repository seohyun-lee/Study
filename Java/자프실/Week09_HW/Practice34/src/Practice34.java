import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		Rectangle rtg1 = new Rectangle();
		Rectangle rtg2 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		rtg1.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rtg1.height = sc.nextInt();
		System.out.println("두 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		rtg2.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rtg2.height = sc.nextInt();
		
		System.out.println("\n첫 번째 사각형의 면적은 "+rtg1.height*rtg1.width+"입니다.");
		System.out.println("첫 번째 사각형의 둘레는 "+(rtg1.height+rtg1.width)*2+"입니다.");
		System.out.println("\n두 번째 사각형의 면적은 "+rtg2.height*rtg2.width+"입니다.");
		System.out.println("두 번째 사각형의 둘레는 "+(rtg2.height+rtg2.width)*2+"입니다.");
		sc.close();
	}

}
