import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice81 {
	
	private static void loadList(String fname, ArrayList<Integer> list) {
		try {
			FileReader fin = new FileReader(fname);
			int c;
			int temp = 0;
			boolean negativeChecker = false;
			boolean numberChecker = false;
			while ((c = fin.read()) != -1) {
				if (c == '-') {
					negativeChecker = true;
				}
				else if (c >= '0' && c <= '9') {
					temp = temp * 10 + (c - '0');
					numberChecker = true;
				} else if (numberChecker == true) {
					if (negativeChecker == true) {
						temp = -1 * temp;
						negativeChecker = false;
					}
					list.add(temp);
					temp = 0;
					numberChecker = false;
				}
			}
			if (numberChecker == true) { //남은 숫자 확인
				if (negativeChecker == true) {
					temp = -1 * temp;
				}
				list.add(temp);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일오픈 오류");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

	private static void printList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
			if (i % 10 == 9 || i == list.size() - 1) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
		String fname = sc.next();
		sc.close();
		System.out.println("파일에서 난수를 읽어 들입니다.");
		ArrayList<Integer> numList = new ArrayList<>();
		loadList(fname, numList);
		if (numList == null || numList.size() == 0) {
			System.out.println("난수가 없습니다.");
		} else {
			System.out.println("난수의 개수는 모두 "+numList.size()+"개입니다.");
			System.out.println("입력된 난수는 다음과 같습니다.");
			printList(numList);
			System.out.println("정렬된 난수는 다음과 같습니다.");
			Collections.sort(numList);
			printList(numList);
		}
	}
	
}
