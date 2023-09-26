import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x 값을 입력하세요: ");
		double x = sc.nextDouble();
		double y;
		if (x <= 0)
			y = x*x*x - 9*x + 2;
		else
			y = 7*x + 2;
		System.out.println("f(x) = " + y);
		sc.close();
	}

}
