import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice2 {

	public static void main(String[] args) {
		try {
			System.out.println("c:\\temp\\phone.txt�� ����մϴ�.");
			FileReader fin = new FileReader("c:\\temp\\phone.txt");
			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("���Ͽ��� ����");
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
