import java.util.Scanner;

//예제10: 가위, 바위, 보 게임
public class 예제10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int hum = sc.nextInt();
		int com = (int) (Math.random() * 3);
		System.out.print("인간: " + hum + "  컴퓨터: " + com);
		if (hum > com)
			System.out.println("\t인간 승리");
		else if (hum == com)
			System.out.println("\t무승부");
		else
			System.out.println("\t컴퓨터 승리");
		sc.close();
	}

}
