import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		try {
			FileWriter fout = new FileWriter("c:\\temp\\phone.txt");
			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String input = sc.nextLine();
				if (input.equals("�׸�"))
					break;
				fout.write(input, 0, input.length());
				fout.write("\r\n", 0, 2); //�� ���� ��� ����
			}
			fout.close();
			System.out.println("c:\\temp\\phone.txt�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		sc.close();
	}
}
