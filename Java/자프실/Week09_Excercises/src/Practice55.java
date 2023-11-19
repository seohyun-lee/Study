import java.util.Scanner;

public class Practice55 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean isDone = false;
		int[] num = new int[2];
		int index = 0;
		while (isDone != true) {
			try {
				System.out.print((index+1)+"번 피연산자를 입력하세요: ");
				String str = s.nextLine();
				num[index] = Integer.parseInt(str);
				if (++index == 2)
					isDone = true;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
		}
		System.out.println(num[0]+" + "+num[1]+" = "+(num[0]+num[1]));
		s.close();
	}

}
