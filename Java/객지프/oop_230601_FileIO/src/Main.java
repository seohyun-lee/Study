import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//������
		//File file1 = new File("C:\\Users\\SAMSUNG\\Documents\\oop_temp\\in.txt");
		//File file2 = new File("C:\\Users\\SAMSUNG\\Documents\\oop_temp\\out.txt");
		
		//�����
		File file1 = new File(".\\src\\text\\input.txt");
		File file2 = new File(".\\src\\text\\output.txt");
		
		Scanner input = null;
		PrintWriter output = null;
		
		try {
			input = new Scanner(file1); //���� ���� ����
			output = new PrintWriter(file2); //�� ���� ����
			
			output.println("======Start=======");
			while(input.hasNext()) {
				String s = input.nextLine();
				System.out.println(s);
				output.println(s);
			}
			output.println("======End======");
			output.flush();
		
		} catch (FileNotFoundException e) {
			System.out.println("������ ���ų� �� �д� ��Ȳ�Դϴ�.");
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("��Ÿ ���ܰ� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
			
		} finally {
			input.close();
			output.close();
		}
		System.out.println("���� ����� �Ϸ��Ͽ����ϴ�.");
	
	}

}
