import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String fname1 = sc.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String fname2 = sc.next();
		try {
			FileReader fin1 = new FileReader(fname1);
			FileReader fin2 = new FileReader(fname2);
			System.out.println(fname1+"�� "+fname2+"�� ���մϴ�.");
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
				System.out.println("������ �����ϴ�.");
			else
				System.out.println("������ ���� �ʽ��ϴ�.");
			fin1.close();
			fin2.close();
		} catch (FileNotFoundException e) {
			System.out.println("���Ͽ��� ����");
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		sc.close();
	}

}
