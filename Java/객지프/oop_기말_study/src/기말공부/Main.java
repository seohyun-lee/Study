package �⸻����;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("in.txt"); //�빮��!!
		File file2 = new File("out.txt"); 
		
		File file3 = new File("���");
		
		Scanner input = null;
		PrintWriter output = null;
		try {
			input = new Scanner(file1);
			output = new PrintWriter(file2);
			//���⼭ System.out.println()�� �Ѵٸ� �װ͵��� ��� �ֿܼ��� ��µǰ� ���Ͽ� ��µ��� �ʴ´�.
			while(input.hasNext()) {
				String s = input.nextLine();
				output.println(s);
			}
		} catch (FileNotFoundException e ) {
			System.out.println();
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		} finally {
			input.close();
			output.close();
		}
		System.out.println("���� ��� �Ϸ�");
	}
}
