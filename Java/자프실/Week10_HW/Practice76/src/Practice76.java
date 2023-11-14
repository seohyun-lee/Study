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
			System.out.print("("+(i+1)+"��)");
			printArray(list);
			if (searchArray(list, c.key)==true) {
				System.out.println(i+1+"�� ���࿡�� ���� "+c.key+"�� �߻������Ƿ� ���α׷��� �����մϴ�.");
				break;
			}
		}
	}
	
	private static Config getInput() {
		Scanner sc = new Scanner(System.in);
		Config c;
		int size, range, key;
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		size = sc.nextInt();
		System.out.print("�������� ������ �����ϼ���: ");
		range = sc.nextInt();
		range += 1;
		System.out.print("ã�� ���� �������� �Է��ϼ���: ");
		key = sc.nextInt();
		sc.close();
		try {
			if (key >= range)
				throw new ImproperKeyValueException("�������� ������ �߸��Ǿ����ϴ�.");
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
