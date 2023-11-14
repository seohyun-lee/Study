import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Config{
	
	int size;
	int range;
	int key;
	
	public Config(int size, int range, int key) {
		this.size = size;
		this.range = range;
		this.key = key;
	}
}

public class Practice76 {
	
	public static void main(String[] args) {
		Config c = getInput();
		for (int i = 0; ; i++) {
			ArrayList<Integer> list = getRandomNumbers(c);
			System.out.print("("+(i+1)+"차)");
			printArray(list);
			if (searchArray(list, c.key)==true) {
				System.out.println(i+1+"차 실행에서 난수 "+c.key+"가 발생했으므로 프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	private static Config getInput() {
		Scanner sc = new Scanner(System.in);
		Config c;
		int size, range, key;
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		size = sc.nextInt();
		System.out.print("난수값의 범위를 설정하세요: ");
		range = sc.nextInt();
		range += 1;
		System.out.print("찾고 싶은 난수값을 입력하세요: ");
		key = sc.nextInt();
		sc.close();
		try {
			if (key >= range)
				throw new ImproperKeyValueException("난수값의 범위가 잘못되었습니다.");
			c = new Config(size, range, key);
		} catch (ImproperKeyValueException e) {
			return null;
		}
		return c;
	}
	
	private static ArrayList<Integer> getRandomNumbers(Config c) {
		ArrayList<Integer> totalRange = new ArrayList<>();
		for (int i = 0; i<c.range; i++) {
			totalRange.add(i);
		}
		Collections.shuffle(totalRange);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i<c.size; i++) {
			list.add(totalRange.get(i));
		}
		return list;
	}
	
	private static void printArray(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print("\t"+list.get(i));
			if (i % 10 == 9 || i == list.size() - 1) {
				System.out.println();
			}
		}
	}
	
	private static boolean searchArray(ArrayList<Integer> list, Integer key) {
		return list.contains(key);
	}
}
