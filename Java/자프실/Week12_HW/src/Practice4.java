import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String fname1 = sc.next();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String fname2 = sc.next();
		try {
			FileReader fin1 = new FileReader(fname1);
			FileReader fin2 = new FileReader(fname2);
			System.out.println(fname1+"와 "+fname2+"를 비교합니다.");
			int c = -1;
			int d = -1;
			boolean flag = true;
			while ((c = fin1.read()) != -1 && (d = fin2.read()) != -1) {
				if (c != d) {
					flag = false;
					break;
				}
			}
			if (fin1.read() != -1 || fin2.read() != -1) {
				flag = false;
            }
			if (flag == true)
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 같지 않습니다.");
			fin1.close();
			fin2.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일오픈 오류");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}

}
