import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			FileWriter fout = new FileWriter("c:\\temp\\phone.txt");
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String input = sc.nextLine();
				if (input.equals("그만"))
					break;
				fout.write(input, 0, input.length());
				fout.write("\r\n", 0, 2); //한 줄을 띄기 위해
			}
			fout.close();
			System.out.println("c:\\temp\\phone.txt에 저장하였습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}
