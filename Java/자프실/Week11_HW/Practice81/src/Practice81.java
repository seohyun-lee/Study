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
			if (numberChecker == true) { //���� ���� Ȯ��
				if (negativeChecker == true) {
					temp = -1 * temp;
				}
				list.add(temp);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("���Ͽ��� ����");
		} catch (IOException e) {
			System.out.println("����� ����");
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
		System.out.print("�������� ����� ���� �̸��� �Է��ϼ���: ");
		String fname = sc.next();
		sc.close();
		System.out.println("���Ͽ��� ������ �о� ���Դϴ�.");
		ArrayList<Integer> numList = new ArrayList<>();
		loadList(fname, numList);
		if (numList == null || numList.size() == 0) {
			System.out.println("������ �����ϴ�.");
		} else {
			System.out.println("������ ������ ��� "+numList.size()+"���Դϴ�.");
			System.out.println("�Էµ� ������ ������ �����ϴ�.");
			printList(numList);
			System.out.println("���ĵ� ������ ������ �����ϴ�.");
			Collections.sort(numList);
			printList(numList);
		}
	}
	
}
