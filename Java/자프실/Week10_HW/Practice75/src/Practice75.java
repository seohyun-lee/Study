import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		int size = sc.nextInt();
		System.out.print("�������� ������ �����ϼ���: ");
		int range = sc.nextInt();
		range += 1;
		ArrayList<Integer> list = getRandomList(size, range);
		System.out.println("������ ���� �迭�� ������ �����ϴ�.");
		printArray10PerLine(list);
		System.out.println("���ĵ� ���� �迭�� ������ �����ϴ�.");
		ArrayList<Integer> b = new ArrayList<>();
		b.addAll(list);
		Collections.sort(b);
		printArray10PerLine(b);
		System.out.println("������ ���� �迭�� ������ �����ϴ�.");
		printArray10PerLine(list);
		System.out.println("���� ū �� : "+b.get(0)+", ���� ���� �� : "+b.get(b.size()-1));
		sc.close();
	}
	
	public static void printArray10PerLine(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print("\t"+a.get(i));
			if (i % 10 == 9 || i == a.size() - 1) {
				System.out.println();
			}
		}
	}
	
	public static ArrayList<Integer> getRandomList(int size, int range) {
		ArrayList<Integer> totalRange = new ArrayList<>();
		for(int i=0; i<range; i++) {
			totalRange.add(i);
		}
		Collections.shuffle(totalRange);

		ArrayList<Integer> randList = new ArrayList<>();
		int cnt = 0;
		for(Integer e : totalRange) {
			randList.add(e);
			if (++cnt == size)
				break;
		}
		return randList;		
	}
}
