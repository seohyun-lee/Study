import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice80 {
	
	private static ArrayList<Integer> getRandomNumbers(int range, int size) {
		ArrayList<Integer> totalRange = new ArrayList<>();
		for (int i = 0; i < range; i++) {
			totalRange.add(i);
		}
		Collections.shuffle(totalRange);
		ArrayList<Integer> randList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			randList.add(totalRange.get(i));
		}
		return randList;
	}
	
	private static void printList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			if (i % 10 == 9 || i == list.size() - 1) {
				System.out.println();
			}
		}
	}
	
	private static void saveFile(ArrayList<Integer> list, String fname) {
		try {
			FileWriter fout = new FileWriter(fname);
			for (int i = 0; i < list.size(); i++) {
				fout.write(list.get(i)+"\n");
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("IO Error");
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> randList = null;
		int size, range;
		String fname;
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		size = sc.nextInt();
		System.out.print("난수 값의 범위를 설정하세요: ");
		range = sc.nextInt() + 1;
		randList = getRandomNumbers(range, size);
		System.out.println("생성된 난수는 다음과 같습니다.");
		printList(randList);
		System.out.print("난수 값을 저장할 파일 이름을 입력하세요: ");
		fname = sc.next();
		saveFile(randList, fname);
		System.out.println("파일 "+fname+"에 난수값이 저장되었습니다.");
		sc.close();
	}

}
