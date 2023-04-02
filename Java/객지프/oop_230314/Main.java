
/*
public class Main {
	public static void main(String[] args) {
		final double PI = 3.14;
		int r;
		double result;
		r=5;
		
		result = r*r*PI;
		System.out.println(r + " * " + r + " * " + PI + " = " + result + " 입니다.");
		System.out.printf("%d * %d * %.2f = %.1f 입니다.", r, r, PI, result);
	}
}
*/

public class Main {
	public static void main(String[] args) {
		String 학과 = "컴퓨터공학과";
		String name = "이서현";
		String 학번 = "2276219";
		
		System.out.print("===================================\n");
		System.out.println("안녕하세요, 반갑습니다!");
		System.out.printf("저는 %s 학번 %s %s입니다.\n", 학과, 학번, name);
		System.out.print("===================================\n");
	}
}
