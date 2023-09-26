import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		double weight = sc.nextDouble();
		double stdwgt = (height - 100) * 0.9;
		System.out.println("표준체중은 " + stdwgt + "입니다.");
		if (stdwgt > weight)
			System.out.println("저체중입니다.");
		else if (stdwgt == weight)
			System.out.println("정상체중입니다.");
		else
			System.out.println("과체중입니다.");
		sc.close();
	}

}
