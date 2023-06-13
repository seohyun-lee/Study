package 기말공부;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("in.txt"); //대문자!!
		File file2 = new File("out.txt"); 
		
		File file3 = new File("경로");
		
		Scanner input = null;
		PrintWriter output = null;
		try {
			input = new Scanner(file1);
			output = new PrintWriter(file2);
			//여기서 System.out.println()을 한다면 그것들은 모두 콘솔에만 출력되고 파일에 출력되지 않는다.
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
		System.out.println("파일 출력 완료");
	}
}
