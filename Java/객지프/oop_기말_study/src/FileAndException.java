

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileAndException {
	
	public static void main(String[] args) {
		File file1 = new File("./src/File/input.txt");
		File file2 = new File("./src/File/out.txt");
		ArrayList<Integer> list = new ArrayList();
		//List list = new ArrayList();��� List, ArrayList �Ѵ� ����Ʈ�ؾ���...
		//Scanner�� PrintWriter�� ���� ������ try�� �ۿ��� �Ѵ�. �ѹ��� �ص� �Ǳ�
		Scanner input=null;
		PrintWriter output=null;
		
		try {
			input = new Scanner(file1);
			output = new PrintWriter(file2);
			
			while(input.hasNext()) { //.hasNextLine�ƴϰ�� .hasNext�Դϴ�!!!!!!!!!!!
				String s = input.nextLine();
				int n = Integer.parseInt(s);
				list.add(n);
				output.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ���ų� �� �д� ��Ȳ�Դϴ�.");
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			System.out.println("�������� �ƴմϴ�.");
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
